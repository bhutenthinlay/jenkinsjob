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
		writeFile file: 'abc.sh', text: 'export PATH=/proc/boot:/bin:/usr/bin:/sbin:/usr/sbin:/home/vsx/vsx0/../bin:/home/vsx/vsx0/BIN echo $PATH'
    		sshScript remote: remote, script: "abc.sh"
		//sshCommand remote: remote, command: "echo $PATH"
		//writeFile file: 'abc.sh', text: 'ls'
		//sshCommand remote: remote, command: "cd /proc/boot"
		//sshCommand remote: remote, command: "export PATH=/proc/boot:/bin:/usr/bin:/sbin:/usr/sbin:/home/vsx/vsx0/../bin:/home/vsx/vsx0/BIN"
    		//sshScript remote: remote, script: "abc.sh"
		//sshCommand remote: remote, command: "use -i libc.so"
		//sshCommand remote: remote, command: "export PATH="
		//sshCommand remote: remote, command: "echo $PATH"
		//sshCommand remote: remote, command: "ls"
		//sh "echo $PATH"
		//def commandResult = sshCommand remote: remote, command: "sh VSX_QNX/pse54_setup.sh"
		//if(commandResult.contain("Password:")){
		//	sshCommand remote: remote, command: "root\n"
		//}
	}
}
