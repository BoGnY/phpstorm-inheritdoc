package dev.bogny.phpstorm.inheritdoc;

import com.intellij.openapi.command.WriteCommandAction;
import com.jetbrains.php.PhpClassHierarchyUtils;
import com.jetbrains.php.lang.documentation.phpdoc.psi.PhpDocComment;
import com.jetbrains.php.lang.psi.PhpCodeEditUtil;
import com.jetbrains.php.lang.psi.PhpPsiElementFactory;
import com.jetbrains.php.lang.psi.elements.Method;
import com.jetbrains.php.lang.psi.elements.PhpClass;
import com.jetbrains.php.lang.psi.elements.PhpClassMember;
import com.jetbrains.php.lang.psi.elements.PhpElementWithModifier;
import com.jetbrains.php.lang.psi.elements.PhpNamedElement;

import java.util.ArrayList;

class InheritDocUtil {
    static boolean namedElementHasParentWithDoc(final PhpNamedElement phpNamedElement)
    {
        final ArrayList<PhpElementWithModifier> results = new ArrayList<>(10);
        if (phpNamedElement instanceof Method) {
            PhpClassHierarchyUtils.processSuperMembers((PhpClassMember) phpNamedElement, (method, subClass, baseClass) -> {
                results.add(method);
                return true;
            });
        } else if (phpNamedElement instanceof PhpClass) {
            results.addAll(PhpClassHierarchyUtils.getImmediateParents((PhpClass)phpNamedElement));
        }

        String commentString = "";

        for (Object result : results) {
            PhpNamedElement superMember = (PhpNamedElement) result;

            if (superMember.isValid() && superMember.getDocComment() != null) {
                commentString = superMember.getDocComment().getText();
            }

            if (commentString.length() > 0) {
                break;
            }
        }

        return (commentString.length() > 0);
    }

    static void fixMissingInheritDocForNamedElement(final PhpNamedElement phpNamedElement)
    {
        if (phpNamedElement.getDocComment() != null) {
            return;
        }

        // write a new docblock with inheritdoc
        WriteCommandAction.writeCommandAction(phpNamedElement.getProject(), phpNamedElement.getContainingFile()).run(() -> {
            String commentString = "/**\n * {@inheritDoc} \n*/";

            PhpDocComment comment = PhpPsiElementFactory.createFromText(
                    phpNamedElement.getProject(),
                    PhpDocComment.class,
                    commentString
            );

            if (comment == null) {
                return;
            }

            PhpCodeEditUtil.insertDocCommentBeforeAndGetTextRange(phpNamedElement, comment);
        });
    }

    static void replaceDocblockForNamedElement(final PhpNamedElement phpNamedElement)
    {
        // write a new docblock with inheritdoc
        WriteCommandAction.writeCommandAction(phpNamedElement.getProject(), phpNamedElement.getContainingFile()).run(() -> {
            PhpDocComment docComment = phpNamedElement.getDocComment();
            if (docComment == null) {
                return;
            }
            docComment.delete();
        });

        InheritDocUtil.fixMissingInheritDocForNamedElement(phpNamedElement);
    }
}
