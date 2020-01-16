pipeline {
	agent { label 'ansible2.3.2' }
	stages {
		stage('test') {
			steps {
				echo 'Lets do some java stuff'
				sh 'java -version'
				echo 'About to read all of HelloWorld.java to see if I can access files in the git directory'
				sh 'cat HelloWorld.java'
				echo 'OK so it works!'
				echo 'Now lets see if we can compile and run the java code'
				sh 'javac HelloWorld.java'
				sh 'java HelloWorld'
			}
		}
	}
}