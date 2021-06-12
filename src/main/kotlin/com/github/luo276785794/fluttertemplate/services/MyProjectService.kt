package com.github.luo276785794.fluttertemplate.services

import com.github.luo276785794.fluttertemplate.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
