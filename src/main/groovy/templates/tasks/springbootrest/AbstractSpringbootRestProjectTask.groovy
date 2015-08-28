/*
 * Copyright (c) 2011,2012 Eric Berry <elberry@tellurianring.com>
 * Copyright (c) 2013 Christopher J. Stehno <chris@stehno.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package templates.tasks.springbootrest
import templates.ProjectTemplate
import templates.tasks.AbstractProjectTask
/**
 * Base class for Springboot Rest Java project tasks.
 */
abstract class AbstractSpringbootRestProjectTask extends AbstractProjectTask {

    AbstractSpringbootRestProjectTask( final String name, final String description ){
        super( name, description )
    }

    /**
     * Creates the basic Java project directory structure.
     *
     * @param path the root of the project. Optional,defaults to user.dir.
     */
    protected void createBase(String path = defaultDir() ){
        ProjectTemplate.fromRoot(path) {
            'src' {
                'main' {
                    'java' {
                        'com' {
                            'blackbaud' {
                                'template' {
                                    'api' {}
                                    'client' {}
                                    'config' {}
                                    'core' {
                                        'domain' {}
                                    }
                                    'resources'{}
                                }
                            }
                        }
                    }
                    'resources' {}
                }
                'test' {
                    'groovy' {
                        'com' {
                            'blackbaud' {
                                'template' {}
                            }
                        }
                    }
                    'resources' {}
                }
                'mainTest' {
                    'groovy' {
                        'com' {
                            'blackbaud' {
                                'template' {}
                                'testsupport' {}
                            }
                        }
                    }
                }
            }
        }
    }
}
