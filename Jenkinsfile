pipeline{
	agent any
	stages{
       stage('Compile')
       {
         steps{
            
              echo 'attempting to compile...'
         
              
                 sh 'mvn clean compile' 
              
            
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