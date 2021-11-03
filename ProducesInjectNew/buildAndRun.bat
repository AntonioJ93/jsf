@echo off
call mvn clean package
call docker build -t com.antonio/tarea3_ProducesFactura_anotaciones .
call docker rm -f tarea3_ProducesFactura_anotaciones
call docker run -d -p 9080:9080 -p 9443:9443 --name tarea3_ProducesFactura_anotaciones com.antonio/tarea3_ProducesFactura_anotaciones