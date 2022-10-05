FROM openjdk:11
EXPOSE 8084
ADD target/spring-jenkins-cicd.jar spring-jenkins-cicd.jar
ENTRYPOINT ["java", "-jar", "/spring-jenkins-cicd.jar"]