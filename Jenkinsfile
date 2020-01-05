pipeline{
	agent any
 
	
	stages{
	
	       stage('Example Print') {
            steps{
               echo "current build number: ${currentBuild.number}"
            echo "previous build number: ${currentBuild.previousBuild.getNumber()}"
          
            }
        }
	
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
                
script {
            fileOperations([
                   /* fileDownloadOperation(
                            password: '',
                            targetFileName: 'foo.zip',
                            targetLocation: "${WORKSPACE}",
                            url: 'https://foobar.com/foo.zip',
                            userName: ''),
                    fileUnZipOperation(
                            filePath: 'foo.zip',
                            targetLocation: '.'),
                    folderCopyOperation(
                            destinationFolderPath: 'dest',
                            sourceFolderPath: 'foo/content'),*/
                    folderDeleteOperation(
                            'data.zip'
                    )
            ])
        }                
                
                
                //bat "mkdir -p archive"
                writeFile file: "archive/usefulfile.txt", text: "This file is useful, need to archive it."
                bat "echo test > archive/test.txt"
                zip zipFile: "data.zip", archive: false, dir: "src"
            }
       }
    }


}