pipeline {
  agent any

  environment {
          HELLO_MESSAGE = "${params.HELLO_MESSAGE}"
  }

  stages {
    stage('Test') {
      steps {
        sh 'mvn clean test -Pprod'
      }
    }

    stage('Build Images') {
      steps {
        sh 'mvn spring-boot:build-image -Pprod'
      }
    }

    stage('Start Docker Containers') {
      steps {
        sh 'docker-compose down'
        sh 'docker-compose up -d --build'
      }
    }
  }
}