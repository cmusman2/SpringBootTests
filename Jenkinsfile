pipeline{
	agent any
	environment {
        XCODE_BUILD_NUMBER = VersionNumber(projectStartDate: '1970-01-01', versionNumberString: '${BUILD_DATE_FORMATTED, "yyyyMMddHHmm"}', versionPrefix: '')
    }
	
	stages{
       stage('Compile')
       {
         steps{
                echo "tested ..."
                bat "mvn clean compile"
                echo "done"
         }
        
       }
       
       stage('Example Print') {
            steps{
                echo XCODE_BUILD_NUMBER
                bat 'add dollar sign when using bat: $XCODE_BUILD_NUMBER' 
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