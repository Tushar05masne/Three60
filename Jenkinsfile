pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {

                git 'https://github.com/Tushar05masne/Three60.git'

            }
        }
        stage('Build & Test') {
            steps {
                sh "mvn clean test -Dsurefire.suiteXmlFiles=src/test/resources/testng.xml"
            }
        }
    }
    post {
        always {
            junit 'target/surefire-reports/*.xml'
        }
    }
}
