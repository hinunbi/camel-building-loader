pipeline {
  agent {
    docker {
      image 'maven:3.3.9-jdk-8'
    }
    
  }
  stages {
    stage('build') {
      steps {
        sh 'mvn compile'
      }
    }
  }
}