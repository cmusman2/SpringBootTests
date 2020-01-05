pipeline{
	agent any
	stages{
       stage('Compile')
       {
         steps{
            
                sh "mkdir -p archive"
                writeFile file: "archive/usefulfile.txt", text: "This file is useful, need to archive it."
                sh "echo test > archive/test.txt"
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