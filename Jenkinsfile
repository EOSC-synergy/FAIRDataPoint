pipeline {
    agent any

    options {
        buildDiscarder(logRotator(numToKeepStr: '10', artifactNumToKeepStr: '10'))
    }

    stages {
        stage('Trigger FairDataPoint CICD job') {
            when {
                anyOf {
                    branch 'develop'
                }
            }
            steps {
                sh "docker build -t fairdatapoint:local ."
                }
            }
        }
}
