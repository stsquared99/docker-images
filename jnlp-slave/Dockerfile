FROM jenkins/jnlp-slave:3.14-1

USER root

RUN apt-get update && \
  apt-get install -qqy bash git nodejs npm

RUN mkdir /var/jenkins_data

RUN chown jenkins /var/jenkins_data

USER jenkins

RUN git config --global user.email "test@liferay.com" && \
  git config --global user.name "Test Test"

RUN git clone https://github.com/dwyl/learn-tdd /var/jenkins_data/learn-tdd
RUN git clone https://github.com/ingydotnet/git-subrepo /var/jenkins_data/git-subrepo

ADD test.sh /var/jenkins_data