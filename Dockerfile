#
# Build stage
#
FROM jelastic/maven:3.9.5-openjdk-21 AS build
COPY . .
RUN mvn clean package -Pprod -DskipTests

#
# Package stage
#
FROM openjdk:21-jdk-slim
COPY --from=build /target/siapweb-0.0.1-SNAPSHOT.jar siapweb.jar
# ENV PORT=8080
EXPOSE 8080
ENTRYPOINT ["java","-jar","siapweb.jar"]    