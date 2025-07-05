# Etapa 1: Construcción del WAR con Maven
FROM maven:3.8.5-openjdk-11 AS build

WORKDIR /app

# Copiar todos los archivos del proyecto
COPY . .

# Compilar el proyecto y generar el WAR
RUN mvn clean package

# Etapa 2: Imagen final con Tomcat
FROM tomcat:9.0-jdk11

# Limpiar las apps por defecto de Tomcat
RUN rm -rf /usr/local/tomcat/webapps/*

# Copiar el WAR generado al servidor Tomcat
COPY --from=build /app/target/RSA-Descifrado-1.0-SNAPSHOT.war /usr/local/tomcat/webapps/ROOT.war

# Exponer el puerto que usará Render (por defecto Render expone el 10000 pero se redirige)
EXPOSE 8080

# Comando para iniciar Tomcat
CMD ["catalina.sh", "run"]
