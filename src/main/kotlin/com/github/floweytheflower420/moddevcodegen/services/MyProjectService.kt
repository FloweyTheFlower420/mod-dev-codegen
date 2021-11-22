package com.github.floweytheflower420.moddevcodegen.services

import com.intellij.openapi.project.Project
import com.github.floweytheflower420.moddevcodegen.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
