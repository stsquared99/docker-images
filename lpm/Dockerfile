FROM library/ubuntu:xenial

RUN apt-get -y update && apt-get install -y curl git iputils-ping rsync sshpass

RUN adduser user --disabled-password --gecos ''

COPY .bash_aliases /root/.bash_aliases

RUN sed -i '/^Host/a ServerAliveInterval 30' /etc/ssh/ssh_config
RUN sed -i '/^Host/a StrictHostKeyChecking no' /etc/ssh/ssh_config
RUN sed -i '/^Host/a TCPKeepAlive yes' /etc/ssh/ssh_config