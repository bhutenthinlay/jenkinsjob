def call () {
	def remote = [:]
	remote.name = 'pse54'
	remote.host = '172.16.201.131'
	remote.user = 'vsx0'
	remote.password = 'vsx0'
	remote.allowAnyHosts = true
	stage('Remote SSH') {
		//sshCommand remote: remote, command: "uname -a"
		//sshCommand remote: remote, command: "use -i libc.so"
		sshCommand remote: remote, command: "export PATH=$PATH:/proc/boot"
		sshCommand remote: remote, command: "echo $PATH"
		sshCommand remote: remote, command: "ls", sudo: true
		//sh "ls"
		//def commandResult = sshCommand remote: remote, command: "sh VSX_QNX/pse54_setup.sh"
		//if(commandResult.contain("Password:")){
		//	sshCommand remote: remote, command: "root\n"
		//}
	}
}
