package templates.tasks.springbootrest

import org.junit.Test
import templates.AbstractTaskTester

class ExportSpringbootRestTemplatesTaskTest extends AbstractTaskTester {

    ExportSpringbootRestTemplatesTaskTest() {
        super(ExportSpringbootRestTemplatesTask)
    }

    @Test
    void export() {
        task.export()

        assertFileExists folder.root, 'templates/springbootrest/build.gradle.tmpl'
        assertFileExists folder.root, 'templates/springbootrest/gradle.properties.tmpl'
    }
}
