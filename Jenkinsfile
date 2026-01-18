pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {

               git branch: 'master123', url: 'https://github.com/Tushar05masne/Three60.git'

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
            // Option 1: Use JUnit plugin (works with Surefire XMLs)
            junit 'target/surefire-reports/*.xml'

            // Option 2: If TestNG Results Plugin is installed and testng-results.xml is generated
            // publishTestNGResults testNGXML: 'target/surefire-reports/testng-results.xml'
        }
    }
}