pipeline {
  agent {
    docker {
      image 'maven:3-jdk-8'
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