pipeline {
	agent { docker { image 'node:16.13.1-alpine'}}
	stages {
		stage('Build') {
			steps{
				sh 'node --version'
				echo "build phase executed"
			}
		}
		stage('Test') {
			steps{
				echo "test phase executed"
			}
		}
		stage('Deploy') {
			steps{
				echo "deploy phase executed"
			}
		}
	}
}
