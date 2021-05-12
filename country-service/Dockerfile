FROM adoptopenjdk/openjdk15:alpine-jre
MAINTAINER Vishesh Awasthi <visheshkawasthi@gmail.com>
ADD build/libs/country-service.jar country-service.jar
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "country-service.jar"]