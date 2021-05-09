#!/bin/bash
echo pwd
echo ls
java -jar dockerdemo-1.0-SNAPSHOT.jar $1 >> /home/logs/dockerdemo-${CONTAINER_NAME}.log