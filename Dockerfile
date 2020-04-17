FROM openjdk:11-jre-slim
ADD target/app-for-dockerhub.jar app-for-dockerhub.jar
EXPOSE 1478
ENTRYPOINT ["java", "-jar", "app-for-dockerhub.jar"]