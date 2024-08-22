# Dockerfile
FROM vivek081141/springboot-gcp-app:latest

# Expose the port that your Spring Boot app runs on
EXPOSE 8080

# Optionally, specify an entrypoint if your image needs one
ENTRYPOINT ["java", "-Dserver.port=18012", "-jar", "/spring-gcp-app.jar"]

# Or use the CMD instruction to start the Spring Boot application
CMD ["java", "-Dserver.port=18012", "-jar", "/spring-gcp-app.jar"]
