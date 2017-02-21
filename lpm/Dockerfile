FROM library/ubuntu:xenial

RUN apt-get -y update && apt-get install -y git rsync sshpass

COPY .bash_aliases /root/.bash_aliases

RUN sed -i '/^Host/a StrictHostKeyChecking no' /etc/ssh/ssh_config
