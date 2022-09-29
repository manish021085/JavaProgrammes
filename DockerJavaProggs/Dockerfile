#base image detail
FROM openjdk:11
COPY . /src/java
WORKDIR /src/java
RUN ["javac", "DockerJavaExample.java"]
ENTRYPOINT ["java", "DockerJavaExample"]