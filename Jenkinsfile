pipeline {
    agent any

    stages {
        stage('Compile') {
            steps {
                // Changed 'sh' to 'bat' for Windows batch commands
                bat 'javac ParamProgram.java'
            }
        }

        stage('Run Program') {
            steps {
                // Changed 'sh' to 'bat'
                bat 'java ParamProgram hello world'
            }
        }
    }
}
