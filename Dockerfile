FROM openjdk:latest

EXPOSE 8081

ADD target/kubernetes.jar kubernetes.jar

ENTRYPOINT [ "java", "-jar","kubernetes.jar" ]