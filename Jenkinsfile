pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
               echo "build successful"
              bat "mvn clean"
            }
        }
        stage('Test') {
            steps {
                echo "Test successful"
              bat "mvn test"
            }
        }
        stage('Deploy') {
            steps {
               echo "Test successful"
              bat "mvn deploy"
            }
        }
    }
}
