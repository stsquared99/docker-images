FROM jenkins/jenkins:2.73.2

COPY jenkins_home /var/jenkins_home

RUN /usr/local/bin/install-plugins.sh < /var/jenkins_home/plugins.txt

RUN echo 2.73.2 > /var/jenkins_home/jenkins.install.InstallUtil.lastExecVersion
RUN echo 2.73.2 > /var/jenkins_home/jenkins.install.UpgradeWizard.state