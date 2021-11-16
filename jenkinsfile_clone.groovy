//Descriptive pipeline
pipeline{
    agent any
    stages{
        stage("checkout"){
            steps{
                println "cloning"
                sh "ls -l"
            }
        }
        stage("build"){
            steps{
                println "mvn package"
                sh "mvn clean package"
                sh "ls -l target/"
            }
        }
    }
}