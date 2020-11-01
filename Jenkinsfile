#!/usr/bin/env groovy
//@Library ('pse54-mainline-test') _

pipeline {

    options {
        ansiColor('xterm')
    }

    agent { label 'master' }

    stages {
        //  stage ('Setup Test Environemnt') {
        //      parallel {
        //          stage ('Checkout mainline SDP') {
        //              steps { script { svn_checkout.sdp("mainline") } }
        //          }

        //          stage ('Checkout PSE54 project branch') {
        //              steps { script { svn_checkout.pse54() } }
        //          }
        //      }
        //  }
        //  stage ( 'Setup VMware Image' ) {
        //      steps { setup_VM("mainline","vmware") }
        //  }
        //  stage ( 'Run VMware Image' ) {
        //      steps { run_VM() }
        //  }
        // stage ('Store Results to Athena') {
        //     steps { store_results("mainline") }
        // }
        stage ( 'SSH CONNECTION' ) {
             steps { ssh_connection() }
         }
 
    }
    post {
    	failure {
    			emailext body: """Jenkins Job URL: ${env.BUILD_URL}""",
                    subject: "${env.JOB_NAME} - Build # ${env.BUILD_NUMBER} - Failed",
                    mimeType: 'text/html',to: "vkochar@blackberry.com,tthinlay@blackberry.com"
		cleanWs();
            }
            success {
            	emailext body: """<pre>\${FILE, path="Summary.html"}</pre> Jenkins Job URL: ${env.BUILD_URL}""",
                    subject: "${env.JOB_NAME} - Build # ${env.BUILD_NUMBER} - Successful",
                    mimeType: 'text/html',to: "vkochar@blackberry.com,tthinlay@blackberry.com"
		cleanWs();
          }
//	always{
         //   cleanWs();
       // }
    	}
        
        
    
}
