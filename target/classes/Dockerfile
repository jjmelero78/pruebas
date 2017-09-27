FROM anapsix/alpine-java
VOLUME /tmp
ADD pruebas-0.1.0.jar pruebas.jar
EXPOSE 9999
CMD ["java","-Djava.security.egd=file:/dev/./urandom","-jar","-Xmx64m","pruebas.jar"]