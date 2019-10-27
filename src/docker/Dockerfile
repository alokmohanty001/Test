# FROM openjdk:11-jre-slim
# EXPOSE 8081
# ENTRYPOINT ["java","-jar","/target/docker.jar"]

FROM java:8
VOLUME /tmp
ADD docker.jar app.jar
RUN bash -c 'touch /app.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
