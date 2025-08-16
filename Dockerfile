FROM openjdk:11
COPY target/account-service.jar  app/
MAINTAINER sundhar
EXPOSE 9090
WORKDIR /app/
ENTRYPOINT ["java", "-jar", "account-service-jar"]
