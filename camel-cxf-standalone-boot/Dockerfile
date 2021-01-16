FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/*.jar
ADD ${JAR_FILE} camel-boot-cxf.jar
EXPOSE 3000
ENTRYPOINT ["java","-jar","camel-boot-cxf.jar"]