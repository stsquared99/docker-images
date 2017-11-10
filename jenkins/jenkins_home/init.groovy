def env = System.getenv()

def ant = new AntBuilder()

ant.replace(file: "/var/jenkins_home/config.xml", token: "JENKINS_PORT_8080_TCP_ADDR", value: env["JENKINS_PORT_8080_TCP_ADDR"])

jenkins.model.Jenkins.instance.reload()