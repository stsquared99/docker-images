def env = System.getenv()

def ant = new AntBuilder()

def address = InetAddress.getLocalHost().getHostAddress()

ant.replace(file: "/var/jenkins_home/config.xml", token: "CONTAINER_IP", value: address)

jenkins.model.Jenkins.instance.reload()