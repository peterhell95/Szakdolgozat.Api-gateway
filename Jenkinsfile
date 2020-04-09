pipeline {
    agent any
    tools { 
        maven 'Maven' 
        jdk 'Java' 
    }
    stages {

         stage ('Maven Build') {
            steps {
                sh 'mvn clean install' 
            }
        }
        
         stage ('Docker Build') {
            steps {
                sh 'docker build -t peterhell95/apigateway:jenkins .' 
            }
        }
        
        stage ('Docker Login') {
            steps {
                sh 'docker login -u peterhell95 -p Negro123Negro' 
            }
        }
        
         stage ('Docker Push') {
            steps {
                sh 'docker push peterhell95/apigateway:jenkins' 
            }
        }
    }
}