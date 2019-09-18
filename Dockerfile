FROM maven:3.6-jdk-8 AS build

COPY src /usr/src/ufp-greetings/src
COPY pom.xml /usr/src/ufp-greetings

RUN mvn -f /usr/src/ufp-greetings/pom.xml clean install

FROM openjdk:8-slim
COPY --from=build /usr/src/ufp-greetings/target/ufp-greetings.jar /usr/app/ufp-greetings.jar
ENTRYPOINT ["java","-jar","/usr/app/ufp-greetings.jar"]