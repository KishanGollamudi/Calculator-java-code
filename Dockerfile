# Use Eclipse Temurin instead of deprecated OpenJDK
FROM eclipse-temurin:17-jdk-alpine

# Set working directory
WORKDIR /app

# Copy jar from build context
COPY target/*.jar app.jar

# Expose application port (change if needed)
EXPOSE 8080

# Run Spring Boot application
ENTRYPOINT ["java", "-jar", "app.jar"]
