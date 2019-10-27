FROM maven:3.6.0-jdk-11-slim AS build
RUN mvn -f /Users/barsa/Documents/Workspace/Test/pom.xml clean package

FROM openjdk:11-jre-slim
EXPOSE 8081
ENTRYPOINT ["java","-jar","/Users/barsa/Documents/Workspace/Test/target/docker.jar"]
