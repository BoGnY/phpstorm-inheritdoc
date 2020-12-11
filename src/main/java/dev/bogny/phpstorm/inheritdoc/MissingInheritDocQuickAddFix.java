package dev.bogny.phpstorm.inheritdoc;

import com.intellij.codeInspection.LocalQuickFix;
import com.intellij.codeInspection.ProblemDescriptor;
import com.intellij.openapi.project.Project;
import com.intellij.psi.util.PsiTreeUtil;
import com.jetbrains.php.lang.psi.elements.PhpNamedElement;
import org.jetbrains.annotations.NotNull;

public class MissingInheritDocQuickAddFix implements LocalQuickFix {
    static final MissingInheritDocQuickAddFix INSTANCE = new MissingInheritDocQuickAddFix();
    @NotNull
    @Override
    public String getName() {
        return "Add inheritDoc";
    }

    @NotNull
    @Override
    public String getFamilyName() {
        return "PHPDoc";
    }

    @Override
    public void applyFix(@NotNull Project project, @NotNull ProblemDescriptor problemDescriptor)
    {
        final PhpNamedElement phpNamedElement = PsiTreeUtil.getParentOfType(
                problemDescriptor.getPsiElement(),
                PhpNamedElement.class
        );

        InheritDocUtil.fixMissingInheritDocForNamedElement(phpNamedElement);
    }
}
