pipeline{
	agent any
	stages{
       stage('Compile')
       {
         steps{
           step{
             echo 'attempting to compile...'
           }
             
            step{
              withMven(maven : 'maven_3_5_0')
              {
                sh 'mvn clean compile'
              }
           }
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