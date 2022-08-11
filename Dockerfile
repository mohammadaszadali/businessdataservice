FROM openjdk:8-jre-alpine

ADD target/BusinessDataService-1.0.jar app.jar

RUN sh -c 'touch /app.jar'

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
