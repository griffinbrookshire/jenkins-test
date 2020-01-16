node {
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
