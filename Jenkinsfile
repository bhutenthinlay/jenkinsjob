//#!/usr/bin/env groovy
@Library ('pse54-mainline-test') _

pipeline {

    options {
        ansiColor('xterm')
    }

    agent any

    stages {
        stage ( 'SSH CONNECTION vsx0' ) {
             steps { 
		     script { ssh_connection("${params.vsx0}") }
		   }
	}
	    stage ( 'SSH CONNECTION root '){
		    steps {
			    script { ssh_connection("${params.root}") }
		   }
	    }
	     stage ( 'run test '){
		    steps {
			    script { run_test() }
		   }
	    }
    }
}
