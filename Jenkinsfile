pipeline {
    agent {
        docker { image 'node:7-alpine' }
    }
    stages{
        stage('Checkout') {
            git url: 'https://github.com/alokmohanty001/Test.git', branch: 'master'
        }
 
        stage('Build') {
            sh 'mvn package docker:build'
        }
 
        stage ('Run') {
            sh 'docker run -p 8080:8080 docker/docker:latest'
        }
    }
    
}
