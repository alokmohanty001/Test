pipeline {
    agent {
        docker { image 'node:7-alpine' }
    }
    stage('Checkout') {
            git url: 'https://github.com/alokmohanty001/Test.git', branch: 'master'
        }
 
        stage('Build') {
            sh 'mvn clean install'
 
            def pom = readMavenPom file:'pom.xml'
            print pom.version
            env.version = pom.version
        }
 
        stage('Image') {
            dir ('Test') {
                def app = docker.build "localhost:5000/"
                app.push()
            }
        }
 
        stage ('Run') {
            docker.image("localhost:5000/docker").run('-p 2222:2222 -h account --name account --link discovery')
        }
 
        stage ('Final') {
            build job: 'customer-service-pipeline', wait: false
        } 
    }
    
}
