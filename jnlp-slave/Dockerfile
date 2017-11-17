FROM jenkins/jnlp-slave:3.14-1

USER root

RUN apt-get update && \
  apt-get install -qqy bash git

RUN curl -o- https://raw.githubusercontent.com/creationix/nvm/v0.33.6/install.sh | bash

RUN bash ~/.nvm/nvm.sh install 8.9.1

RUN mkdir /var/jenkins_data

RUN chown jenkins /var/jenkins_data

USER jenkins

RUN git config --global user.email "test@liferay.com" && \
  git config --global user.name "Test Test"

RUN git clone https://github.com/dwyl/learn-tdd /var/jenkins_data/learn-tdd
RUN git clone https://github.com/ingydotnet/git-subrepo /var/jenkins_data/git-subrepo

ADD test.sh /var/jenkins_data