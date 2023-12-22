def call () {
    pipeline {
        agent any
        stages {

            stage('compile'){
                steps {
                    echo 'compile'
                }
            }

            stage('Testcases'){
                steps {
                    echo 'Testcases'
                }
            }
            stage('Build'){
                steps {
                    echo 'Build'
                }
            }
            stage('Release'){
                steps {
                    echo 'Release'
                }
            }
        }
    }
}
