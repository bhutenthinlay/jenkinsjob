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
		stage('Remote SSH') {
			sshCommand remote: remote, command: "sh /home/vsx/vsx0/VSX_QNX/pse54_setup2.sh"
		}
	}else{
	 println(" in vsx0")
		stage('Remote SSH') {
			//sshCommand remote: remote, command: "sh VSX_QNX/pse54_setup.sh"
			sshCommand remote: remote, command: "/home/vsx/vsx0/../bin/tcc -b -s pse54posix.bld"
			sshCommand remote: remote, command: "/home/vsx/vsx0/../bin/tcc -b -s pse54xsi.bld"
			sshCommand remote: remote, command: "/home/vsx/vsx0/../bin/tcc -e -s pse54posix.exec"
			sshCommand remote: remote, command: "/home/vsx/vsx0/../bin/tcc -e -s pse54xsi.exec"
		}
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
