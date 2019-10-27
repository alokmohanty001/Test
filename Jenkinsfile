pipeline {
    agent {
        docker { image 'node:7-alpine' }
    }
    stages{
        stage('Checkout') {
            steps{
            git url: 'https://github.com/alokmohanty001/Test.git', branch: 'master'
            }
        }
 
        stage('Build') {
            steps{
            sh 'mvn package docker:build'
            }
        }
 
        stage ('Run') {
            steps{
            sh 'docker run -p 8080:8080 docker/docker:latest'
            }
        }
    }
    
}
