FROM openjdk:21
ARG JAR_FILE=WallApp-0.0.1-SNAPSHOT.jar
WORKDIR /app
COPY target/${JAR_FILE} app.jar
EXPOSE 8080
CMD ["java", "-jar", "app.jar"]
