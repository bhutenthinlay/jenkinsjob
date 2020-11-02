def call () {
	def remote = [:]
	remote.name = 'pse54'
	remote.host = '172.16.201.131'
	remote.user = 'vsx0'
	remote.password = 'vsx0'
	remote.allowAnyHosts = true
	stage('Remote SSH') {
		sshCommand remote: remote, command: "uname -a"
		sshCommand remote: remote, command: "use -i libc.so"
	}
}
