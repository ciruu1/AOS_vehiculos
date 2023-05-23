# Práctica 1 AOS 2023
## Sistema de Gestión de talleres de mecánica rápida
### Grupo 11

- Subsistema_2: Gestión de los vehículos que son propiedad de los clientes y que se reparan y/o revisan en el taller. Cada vehículo estará identificado de forma única por su VIN.


## Instalación

El primer paso es generar el archivo compilado que vamos a ejecutar en el contenedor docker, para eso ejecutamos:

```bash
mvn clean package spring-boot:repackage
```

Y si todo ha salido bien se debería haber creado un archivo llamado `swagger-spring-1.0.0-jar-with-dependencies.jar`
 en el directorio `/target`.

Una vez hecho esto, en el directorio raíz del proyecto ejecutamos:

```bash
docker-compose up
```

Y con eso se deberían estar ejecutando todos los contenedores docker con la aplicación.

Este servidor ha sido generado por [swagger-codegen](https://github.com/swagger-api/swagger-codegen) usando `openapi.yaml`.

Imagen del servicio en [dockerhub](https://hub.docker.com/r/inesdeelias/servicio11/tags).
