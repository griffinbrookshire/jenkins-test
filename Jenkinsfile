pipleline {
  agent 'ansible2.3.2'
  stages {
    stage('test') {
      steps {
        echo 'Testing java'
        sh 'java -version'
        sh label: '', script: 'cat HelloWorld.java'
      }
    }
  }
}
