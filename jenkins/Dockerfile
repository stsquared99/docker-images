FROM jenkins/jenkins:2.73.3

COPY --chown=jenkins:jenkins jenkins_home /var/jenkins_home

RUN /usr/local/bin/install-plugins.sh < /var/jenkins_home/plugins.txt

ENV JAVA_OPTS -Djenkins.install.runSetupWizard=false