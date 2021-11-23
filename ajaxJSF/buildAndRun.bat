@echo off
call mvn clean package
call docker build -t com.mycompany/ajaxJSF .
call docker rm -f ajaxJSF
call docker run -d -p 9080:9080 -p 9443:9443 --name ajaxJSF com.mycompany/ajaxJSF