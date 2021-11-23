#!/bin/sh
mvn clean package && docker build -t com.mycompany/ajaxJSF .
docker rm -f ajaxJSF || true && docker run -d -p 9080:9080 -p 9443:9443 --name ajaxJSF com.mycompany/ajaxJSF