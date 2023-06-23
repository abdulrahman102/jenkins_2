def call(String name = 'null') {

    stage('check') {
        steps {
            echo "checking your code"
            echo name      
        }
    }
}