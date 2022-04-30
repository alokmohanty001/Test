pipeline {
	agent { docker { image 'maven:3.6.3'}}
	stages {
		stage('Build') {
			steps{
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
