package ru.spb.awk.gradle


import org.junit.Test
import org.gradle.testfixtures.ProjectBuilder
import org.gradle.api.Project
import org.gradle.api.DefaultTask
import static org.junit.Assert.*

class OdinAssPluginTest {
    @Test
    public void odinAssPluginAddsGreetingTaskToProject() {
        Project project = ProjectBuilder.builder().build()
        project.pluginManager.apply 'odinass'

        assertTrue(project.tasks.load_cf instanceof DefaultTask)
        assertTrue(project.tasks.save_cf instanceof DefaultTask)
        assertTrue(project.tasks.load_src instanceof DefaultTask)
        assertTrue(project.tasks.save_src instanceof DefaultTask)
    }
}