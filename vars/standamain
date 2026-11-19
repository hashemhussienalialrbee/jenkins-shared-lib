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
                }
            }
        }
    }
}
