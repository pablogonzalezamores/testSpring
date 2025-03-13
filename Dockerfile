# Usar una imagen base de OpenJDK
FROM openjdk:17-jdk-alpine

# Establecer el mantenedor de la imagen
LABEL maintainer="email@gmail.com"

# Establecer el directorio de trabajo dentro del contenedor
WORKDIR /app

# Copiar el archivo War generado por Spring Boot al contenedor
COPY target/demo-0.0.1-SNAPSHOT.war app.jar

# Exponer el puerto en el que la aplicación se ejecutará
EXPOSE 8080

# Comando para ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "app.jar"]