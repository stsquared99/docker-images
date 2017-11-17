#!/bin/bash

set -e
set -x

cd /var/jenkins_data/learn-tdd

npm install

npm test