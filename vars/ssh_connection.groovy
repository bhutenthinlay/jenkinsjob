#!/usr/bin/groovy
def call (user) {
	def remote = [:]
	remote.name = 'pse54'
	remote.host = '172.16.201.131'
	remote.user = user
	remote.password = user
	remote.allowAnyHosts = true
	remote.pty = true
	if(user == "root"){
	 println("in root")
	}else{
	 println(" in vsx0")
	}
	//stage('Remote SSH') {
	//	def commandResult = sshCommand remote: remote, command: "sh VSX_QNX/pse54_setup.sh; root\n"
		//def commandResult = sshCommand remote: remote, command: "pwd"
	//	println(commandResult)
	//	if(commandResult.indexOf("password")){
			//sshCommand remote: remote, command: "root\n"
	//		println("yes it works")
	//	}
	//}
}
