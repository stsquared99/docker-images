FROM jenkins/jenkins:2.73.1

COPY config.xml /var/jenkins_home/config.xml
COPY plugins.txt /var/jenkins_home/plugins.txt
COPY users /var/jenkins_home/users

RUN /usr/local/bin/install-plugins.sh < /var/jenkins_home/plugins.txt

RUN echo 2.73.1 > /var/jenkins_home/jenkins.install.InstallUtil.lastExecVersion
RUN echo 2.73.1 > /var/jenkins_home/jenkins.install.UpgradeWizard.state