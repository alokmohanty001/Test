pipeline {
    agent {
        docker { image 'node:7-alpine' }
    }
    stages{
 
        stage ('Run') {
            steps{
            sh 'docker run -p 8080:8080 docker/docker:latest'
            }
        }
    }
    
}
