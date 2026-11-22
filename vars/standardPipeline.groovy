
def call(Map cfg = [:]) {
    pipeline {
        agent any

        stages {
            stage('Build') {
                steps {
                    echo "Building ${cfg.name}"
                }
            }

            stage('Test') {
    steps {
        echo "Testing ${cfg.name}"
        echo "Running extra checks on ${cfg.name}"
    }
}
            stage('Deploy') {
                steps {
                    echo "Deploying ${cfg.name}"
                }
            }
        }

        post {
            success {
                echo "Pipeline for ${cfg.name} completed successfully!"
            }

            failure {
                echo "Pipeline for ${cfg.name} failed!"
            }

            always {
                echo "Pipeline execution finished."
            }
        }
    }
}
