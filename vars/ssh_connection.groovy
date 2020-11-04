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
		//writeFile file: 'abc.sh', text: 'export PATH=/proc/boot:/bin:/usr/bin:/sbin:/usr/sbin:/home/vsx/vsx0/../bin:/home/vsx/vsx0/BIN echo $PATH'
    		//sshScript remote: remote, script: "abc.sh"
		//sshCommand remote: remote, command: "echo $PATH"
		//writeFile file: 'abc.sh', text: 'ls'
		sshCommand remote: remote, command: "env"
		sshCommand remote: remote, command: "PATH=/proc/boot:/bin:/usr/bin:/sbin:/usr/sbin:/home/vsx/vsx0/../bin:/home/vsx/vsx0/BIN TET_ROOT=/home/vsx USER=vsx0 LD_LIBRARY_PATH=/proc/boot:/lib:/usr/lib:/lib/dll POSIXLY_CORRECT=1 HOME=/home/vsx/vsx0 QNX_HOST=/opt/qnx/sdp/x86_64 QNX_TARGET=/opt/qnx/sdp TET_SUITE_ROOT=/home/vsx TERM=xterm TZ=EST5EDT LOCFILE=/usr/share/locale/locale.file TET_EXECUTE=/home/vsx/vsx0/TESTROOT LOCALE=C-TRADITIONAL SSH_TTY=/dev/ttyp1 ENV=.kshrc LOGNAME=vsx0 ls env"
    		//sshScript remote: remote, script: "abc.sh"
		//sshCommand remote: remote, command: "use -i libc.so"
		//sshCommand remote: remote, command: "export PATH="
		//sshCommand remote: remote, command: "echo $PATH"
		//sshCommand remote: remote, command: "ls"
		//sh "echo $PATH"
		//def commandResult = sshCommand remote: remote, command: "PATH=/proc/boot:/bin:/usr/bin:/sbin:/usr/sbin:/home/vsx/vsx0/../bin:/home/vsx/vsx0/BIN sh VSX_QNX/pse54_setup.sh"
		//if(commandResult.contain("Password:")){
		//	sshCommand remote: remote, command: "root\n"
		//}
	}
}
