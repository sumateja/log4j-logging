# Use a lightweight OpenJDK image
FROM openjdk:17-jdk-slim

# Set working directory
WORKDIR /app

# Copy the shaded JAR into the container
COPY target/EFK-1.0-SNAPSHOT.jar app.jar

COPY log4j.properties .


# Run the application
CMD ["java", "-jar", "app.jar"]
