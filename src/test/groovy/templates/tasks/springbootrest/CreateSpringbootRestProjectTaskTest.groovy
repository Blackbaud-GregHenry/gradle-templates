package templates.tasks.springbootrest

import org.junit.Test
import templates.AbstractTaskTester

class CreateSpringbootRestProjectTaskTest extends AbstractTaskTester {

    CreateSpringbootRestProjectTaskTest() {
        super(CreateSpringbootRestProjectTask)
    }

    @Test
    void create() {
        project.ext[CreateSpringbootRestProjectTask.PROJECT_PARENT_DIR] = folder.getRoot() as String
        project.ext[CreateSpringbootRestProjectTask.NEW_PROJECT_NAME] = 'tester'
        project.ext[CreateSpringbootRestProjectTask.PROJECT_GROUP] = 'test-group'
        project.ext[CreateSpringbootRestProjectTask.PROJECT_VERSION] = '1.1.1'

        task.create()

        assertFileExists folder.root, 'tester/src/main/java'
        assertFileExists folder.root, 'tester/src/main/java/com/blackbaud/template'
        assertFileExists folder.root, 'tester/src/main/java/com/blackbaud/template/api'
        assertFileExists folder.root, 'tester/src/main/java/com/blackbaud/template/client'
        assertFileExists folder.root, 'tester/src/main/java/com/blackbaud/template/config'
        assertFileExists folder.root, 'tester/src/main/java/com/blackbaud/template/core'
        assertFileExists folder.root, 'tester/src/main/java/com/blackbaud/template/core/domain'
        assertFileExists folder.root, 'tester/src/main/java/com/blackbaud/template/resources'
        assertFileExists folder.root, 'tester/src/main/resources'
        assertFileExists folder.root, 'tester/src/test/groovy'
        assertFileExists folder.root, 'tester/src/test/groovy/com/blackbaud/template'
        assertFileExists folder.root, 'tester/src/test/resources'
        assertFileExists folder.root, 'tester/src/mainTest/groovy'
        assertFileExists folder.root, 'tester/src/mainTest/groovy/com/blackbaud/template'
        assertFileExists folder.root, 'tester/src/mainTest/groovy/com/blackbaud/testsupport'

        assertFileContains folder.root, 'tester/gradle.properties', 'group=com.blackbaud'
        assertFileContains folder.root, 'tester/gradle.properties', 'version=1.1.1'
        assertFileContains folder.root, 'tester/gradle.properties', 'artifactId=tester'
    }
}
