FROM jenkins/jnlp-slave:3.14-1

USER root

RUN apt-get update && \
  apt-get install -qqy git nodejs-legacy

USER jenkins

RUN git config --global user.email "test@liferay.com" && \
  git config --global user.name "Test Test"

RUN git clone https://github.com/dwyl/learn-tdd