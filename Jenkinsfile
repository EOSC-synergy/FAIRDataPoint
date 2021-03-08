pipeline {
    agent any

    options {
        buildDiscarder(logRotator(numToKeepStr: '10', artifactNumToKeepStr: '10'))
    }

    stages {
        stage('Trigger CICD job') {
            when {
                anyOf {
                    branch 'develop'
                }
            }
            steps {
                script {
                    build job: "/${JOB_NAME}",
                          propagate: true
                }
            }
        }
    }
}
