@echo off
call mvn clean package
call docker build -t com.mycompany/formularioJSFcoche .
call docker rm -f formularioJSFcoche
call docker run -d -p 9080:9080 -p 9443:9443 --name formularioJSFcoche com.mycompany/formularioJSFcoche