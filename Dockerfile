FROM openjdk:19
EXPOSE 8080
ADD target/BefitBackend.jar BefitBackend.jar
ENTRYPOINT ["java","-jar","/BefitBackend.jar"]