// #!/usr/bin/groovy
// def call () {
// 	def remote = [:]
// 	remote.name = 'pse54'
// 	remote.host = '172.16.201.134'
// 	remote.user = 'vsx0'
// 	remote.password = 'vsx0'
//  	remote.allowAnyHosts = true
// // 	remote.logLevel = 'FINEST'
// // 	remote.pty = true
// // 	 	stage('Remote SSH') {
// // 			sshCommand remote: remote, command: "sh /home/vsx/vsx0/VSX_QNX/runtest.sh"
// // 		}
	
// 	stage('Remote SSH') {
// 		println("Running commands")
// 		def commandResult = sshCommand remote: remote, command: "sh VSX_QNX/pse54_setup.sh"
// // 		def commandResult = sshCommand remote: remote, command: "pwd"
// // 		println(commandResult)
// // 		if(commandResult.indexOf("password")){
// // 			sshCommand remote: remote, command: "root\n"
// // 			println("yes it works")
// // 		}
// 	}
// }
def call(){
	sh """
	#!/bin/bash
	pwd
	cd /home/tthinlay/Desktop/muon/workspace/sdp
	source /home/tthinlay/Desktop/muon/workspace/sdp/qnxsdp-env.sh
	exit 0
	"""
}
