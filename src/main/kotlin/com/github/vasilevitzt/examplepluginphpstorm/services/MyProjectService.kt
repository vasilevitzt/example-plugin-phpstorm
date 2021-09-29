package com.github.vasilevitzt.examplepluginphpstorm.services

import com.intellij.openapi.project.Project
import com.github.vasilevitzt.examplepluginphpstorm.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
