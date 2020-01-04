pipeline{
	agent any
	stages{
       stage('Compile')
       {
         steps{
            
              echo 'attempting to compile...'
            def mvnHome = tool name: 'maven_3_5_0', type: 'maven'
              
                 sh "${mvnHome}/bin/mvn clean compile" 
              
            
         }
        
       }
       
       stage('Build')
       {
          steps{
             echo 'building...'
           }
       }
       
       stage('Test')
       {
          steps{
             echo 'tested ...'
           }
       }
       
        stage('ConfirmDeploy')
       {
          steps{
             input('Ready to deploy?')
           }
       }
       stage('Deploy')
       {
         steps{
              echo 'deploying...'
            }
       }
    }


}