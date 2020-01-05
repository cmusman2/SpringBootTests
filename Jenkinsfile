pipeline{
	agent any
	stages{
       stage('Compile')
       {
         steps{
            
                bat "mkdir -p archive"
                writeFile file: "archive/usefulfile.txt", text: "This file is useful, need to archive it."
                bat "echo test > archive/test.txt"
                zip zipFile: "test.zip", archive: false, dir: "archive"
   
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