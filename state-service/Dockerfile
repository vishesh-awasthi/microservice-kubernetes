FROM adoptopenjdk/openjdk15:alpine-jre
MAINTAINER Vishesh Awasthi <visheshkawasthi@gmail.com>
ADD build/libs/state-service.jar state-service.jar
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "state-service.jar"]