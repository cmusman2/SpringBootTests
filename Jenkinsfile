pipeline{
	agent any
	stages{
       stage('Compile')
       {
         steps{
                echo "tested ..."
                bat "mvn clean compile"
                echo "done"
         }
        
       }
       
       stage('Build')
       {
          steps{
             echo 'building...'
             echo 'done'
           }
       }
       
       stage('Test')
       {
          steps{
             echo 'testing ...'
             bat 'mvn test'
             echo 'done'
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
                 
                writeFile file: "archive/usefulfile.txt", text: "This file is useful, need to archive it."
                bat "echo test > archive/test.txt"
                zip zipFile: "data.zip", archive: false, dir: "src"
            }
       }
    }


}