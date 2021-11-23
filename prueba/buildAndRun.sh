#!/bin/sh
mvn clean package && docker build -t com.mycompany/prueba .
docker rm -f prueba || true && docker run -d -p 9080:9080 -p 9443:9443 --name prueba com.mycompany/prueba