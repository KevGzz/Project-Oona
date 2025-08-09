FROM openjdk:23-jdk-slim

WORKDIR /app
COPY build/libs/Project-Oona.jar Project-Oona.jar
EXPOSE 8085

ENTRYPOINT ["java", "-jar", "webapp.jar"]

#Docker build -t hombre-application:v1
#Docker run -d -p 8080:8080 nombre-application:v1