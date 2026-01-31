pipeline {
    agent any

    triggers {
        githubPush()   // listens to webhook push events
    }

    stages {
        stage('Checkout') {
            when {
                branch 'master123'
            }
            steps {
                git branch: 'master123', url: 'https://github.com/Tushar05masne/Three60.git'
            }
        }

        stage('Build & Test') {
            when {
                branch 'master123'
            }
            steps {
                bat "mvn clean test -Dsurefire.suiteXmlFiles=src/test/resources/testng.xml"
            }
        }

        stage('Compile') {
            when {
                branch 'master123'
            }
            steps {
                bat 'mvn clean compile -Dsurefire.suiteXmlFiles=src/test/resources/testng.xml'
            }
        }
    }

    post {
        always {
            echo "Results"
            // junit 'target/surefire-reports/*.xml'
            // publishTestNGResults testNGXML: 'target/surefire-reports/testng-results.xml'
        }
    }
}