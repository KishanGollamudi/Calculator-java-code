FROM eclipse-temurin:17-jdk-alpine

# Set working directory
WORKDIR /app

# Copy the JAR produced by GitHub Actions
COPY target/*.jar app.jar

# Expose port 5005
EXPOSE 5005

# Run the JAR
ENTRYPOINT ["java", "-jar", "app.jar"]
