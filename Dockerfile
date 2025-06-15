FROM eclipse-temurin:20-jdk

WORKDIR /app

COPY . .

RUN ./mvnw package

CMD ["java", "-jar", "target/wms-backend-0.0.1-SNAPSHOT.jar"]