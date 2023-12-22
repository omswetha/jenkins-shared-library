def call () {
    pipeline {
        agent {
          node { label 'workstation'}
        }
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
