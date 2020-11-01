#!/usr/bin/env groovy
@Library ('pse54-mainline-test') _

pipeline {

    options {
        ansiColor('xterm')
    }

    agent any

    stages {
        stage ( 'SSH CONNECTION' ) {
             steps { ssh_connection() }
         }
    }
}
