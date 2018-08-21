package ru.spb.awk.gradle

import org.gradle.api.Plugin
import org.gradle.api.Project


class OdinAssPlugin implements Plugin<Project> {
    void apply(Project project) {
        project.task('load_cf')
        project.task('save_cf')
        project.task('load_src')
        project.task('save_src')
    }
}