package com.github.tris9.capstoneplugintest.services

import com.intellij.openapi.project.Project
import com.github.tris9.capstoneplugintest.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
