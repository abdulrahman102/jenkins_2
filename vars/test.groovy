def call(boolean params=true){
    when {
        expression{
            params== true 
        }
    }
    steps {
        echo "testing your app" 
    }
}