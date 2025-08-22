# Bước 1: Dùng image Maven để build project
FROM maven:3.9.6-eclipse-temurin-17 AS build

# Copy toàn bộ source code vào container
COPY . /app
WORKDIR /app

# Build project (sinh ra file jar trong target/)
RUN mvn clean package -DskipTests

# Bước 2: Dùng image Java để chạy app
FROM eclipse-temurin:17-jdk-alpine

# Copy file jar từ bước build sang image final
COPY --from=build /app/target/*.jar app.jar

# Cổng mà app sẽ chạy
EXPOSE 9999

# Lệnh chạy app
ENTRYPOINT ["java", "-jar", "app.jar"]
