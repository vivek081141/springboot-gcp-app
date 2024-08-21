FROM openjdk:17-jdk-slim
VOLUME /tmp
COPY target/spring-gcp-app-0.0.1-SNAPSHOT.jar spring-gcp-app.jar
EXPOSE 18012
ENTRYPOINT ["java","-jar","spring-gcp-app.jar"]

#docker build -t my-springboot-mongo-app:latest .