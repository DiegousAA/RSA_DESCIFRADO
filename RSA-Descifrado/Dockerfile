# Imagen base con Tomcat + JDK
FROM tomcat:9.0-jdk11

# Limpiar aplicaciones por defecto de Tomcat
RUN rm -rf /usr/local/tomcat/webapps/*

# Copiar tu WAR compilado a la carpeta de despliegue (lo compila Render con Maven)
COPY target/*.war /usr/local/tomcat/webapps/ROOT.war

# Exponer el puerto que usará Render
EXPOSE 8080

# Comando para iniciar Tomcat
CMD ["catalina.sh", "run"]
