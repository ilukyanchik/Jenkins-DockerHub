pipeline {
    environment {
        registry = "ilukyanchik/spring-repo-custom"
        registryCredential = 'dockerhub_id'
        dockerImage = ''
    }
    agent any

    stages {
        stage('Cloning our Git') {
            steps {
                git 'https://github.com/ilukyanchik/Jenkins-DockerHub.git'
            }
        }
        stage('Building our image') {
            steps {
                script {
                    dockerImage = docker.build registry + ":$BUILD_NUMBER"
                }
            }
        }
        stage('Deploying our image') {
            steps {
                script {
                    docker.withRegistry(registry, registryCredential) {
                        dockerImage.push()
                    }
                }
            }
        }
        stage('Cleaning up') {
            steps {
                sh "docker rmi $registry:$BUILD_NUMBER"
            }
        }
    }
}
