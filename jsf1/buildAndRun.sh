#!/bin/sh
mvn clean package && docker build -t com.antonio/jsf1 .
docker rm -f jsf1 || true && docker run -d -p 9080:9080 -p 9443:9443 --name jsf1 com.antonio/jsf1