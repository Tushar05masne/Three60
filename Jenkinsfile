pipeline 
{
    agent any
    
                
        stage('Regression Automation Tests') {
            steps {
                catchError(buildResult: 'SUCCESS', stageResult: 'FAILURE') {
                    git 'https://github.com/Tushar05masne/Three60'
                    sh "mvn clean test -Dsurefire.suiteXmlFiles=src/test/resources/testng.xml"
                    
                }
            }
            
        }
               
        
    }
