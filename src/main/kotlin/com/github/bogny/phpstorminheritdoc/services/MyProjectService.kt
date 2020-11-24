package com.github.bogny.phpstorminheritdoc.services

import com.intellij.openapi.project.Project
import com.github.bogny.phpstorminheritdoc.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
