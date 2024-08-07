pipeline {
    agent any

    tools {
        maven 'Maven' // Name of the Maven installation in Jenkins
    }


    stages {
        stage('Checkout') {
            steps {
                // Checkout the code from the Git repository
                git url: 'https://github.com/automateitnow00/pipeline_jenkins'
            }
        }
        stage('Build') {
            steps {
                script {
                    // Clean and build the project
                    sh 'mvn clean install'
                }
            }
        }

        stage('Test') {
            steps {
                script {
                    // Run tests
                    sh 'mvn test'
                }
            }
        }
    }
        
    post {
        always {
            // Clean up workspace
            cleanWs()
        }
    }
}
