#!/usr/bin/groovy
def call () {
	def remote = [:]
	remote.name = 'pse54'
	remote.host = '172.16.201.131'
	remote.user = 'vsx0'
	remote.password = 'vsx0'
	remote.allowAnyHosts = true
	remote.pty = true
	stage('Remote SSH') {
		def commandResult = sshCommand remote: remote, command: "sh VSX_QNX/pse54_setup.sh"
		//def commandResult = sshCommand remote: remote, command: "pwd"
		println(commandResult)
		if(commandResult.indexOf("Password:")){
			//sshCommand remote: remote, command: "root\n"
			println("yes it works")
		}
	}
}
