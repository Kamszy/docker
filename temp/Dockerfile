FROM openjdk:11-jre-slim

MAINTAINER KAMIL

RUN mkdir /files

COPY application-to-dockerize-1.0-SNAPSHOT.jar /usr/share/myApplication.jar

EXPOSE 8080

ENTRYPOINT [ "/usr/bin/java", "-XX:MaxRAMPercentage=70","-jar", "/usr/share/myApplication.jar" ]
