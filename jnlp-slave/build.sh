#!/bin/bash

TAG="$(date "+%Y%m%d%H%M%S")-$(git rev-parse HEAD)"

docker build -t "stsquared99/jnlp-slave:${TAG}" . && docker push "stsquared99/jnlp-slave:${TAG}"