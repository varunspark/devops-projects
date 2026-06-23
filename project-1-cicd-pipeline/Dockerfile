# Stage 1: Build the app using Maven
FROM maven:3.8.4-amazoncorretto-17 AS build
WORKDIR /app
COPY app/pom.xml .
COPY app/src ./src
RUN mvn clean package -DskipTests

# Stage 2: Run it on a lightweight JRE image
FROM amazoncorretto:17-alpine
WORKDIR /app
COPY --from=build /app/target/sample-app.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
