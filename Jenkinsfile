 libraries {
     lib('pipeline-library-demo')
 }

pipeline {
     agent any
    parameters {
        booleanParam(name:'project', defaultValue: true, description:'this paramater help you to know project name')
        choice(name: 'namespace', choices:['dev','prod','stage'], description: '' ) 
    }

    stages {

        check "${params.namespace}"

    }

}


