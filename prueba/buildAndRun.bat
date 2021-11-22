@echo off
call mvn clean package
call docker build -t com.midominio/prueba .
call docker rm -f prueba
call docker run -d -p 9080:9080 -p 9443:9443 --name prueba com.midominio/prueba