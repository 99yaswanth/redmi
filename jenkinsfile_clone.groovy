//Descriptive pipeline
pipeline{
    agent any
    stages{
        stage("checkout"){
            steps{
                println "cloning"
            }
        }
        stage("build"){
            steps{
                println "mvn package"
            }
        }
    }
}