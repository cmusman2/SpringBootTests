pipeline{
	agent any
	stages{
       stage('Compile')
       {
         steps{
            
                sh 'mkdir archive'
                sh 'echo test > archive/test.txt'
                zip zipFile: 'test.zip', archive: false, dir: 'archive'
   
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