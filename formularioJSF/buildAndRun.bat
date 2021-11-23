@echo off
call mvn clean package
call docker build -t com.mycompany/formularioJSF .
call docker rm -f formularioJSF
call docker run -d -p 9080:9080 -p 9443:9443 --name formularioJSF com.mycompany/formularioJSF