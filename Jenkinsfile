pipeline {
    agent any

    stages {
        stage('Compile') {
            steps {
                sh 'javac ParamProgram.java'
            }
        }

        stage('Run Program') {
            steps {
                sh 'java ParamProgram hello world'
            }
        }
    }
}
