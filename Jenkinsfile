pipeline {
    agent any

    tools {
        maven 'Maven' // Name of the Maven installation in Jenkins
    }

    environment {
        // Add SonarCloud environment variables
        SONARQUBE_SCANNER_HOME = tool name: 'SonarQube Scanner', type: 'hudson.plugins.sonar.SonarRunnerInstallation'
        SONAR_HOST_URL = 'https://sonarcloud.io/'
        SONAR_ORGANIZATION = 'your-sonarcloud-organization' // Replace with your SonarCloud organization
        SONAR_PROJECT_KEY = 'your-sonarcloud-project-key' // Replace with your SonarCloud project key
        SONAR_TOKEN = credentials('sonarcloud-token-id') // Replace with the ID of your SonarCloud token
    }

    stages {
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

        stage('SonarCloud Analysis') {
            steps {
                script {
                    // Run SonarCloud analysis
                    sh """
                        ${SONARQUBE_SCANNER_HOME}/bin/sonar-scanner \
                        -Dsonar.projectKey=${SONAR_PROJECT_KEY} \
                        -Dsonar.organization=${SONAR_ORGANIZATION} \
                        -Dsonar.host.url=${SONAR_HOST_URL} \
                        -Dsonar.login=${SONAR_TOKEN} \
                        -Dsonar.java.binaries=target/classes
                    """
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
