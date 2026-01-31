pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        bat 'mvn clean install'
      }
    }
    stage('SonarQube Analysis') {
      steps {
        withSonarQubeEnv('MySonarQubeServer') {
          bat 'mvn sonar:sonar'
        }
      }
    }
  }
}