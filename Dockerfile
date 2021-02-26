FROM openjdk:8
RUN mkdir -p /home/apps
RUN mkdir -p /home/logs
COPY ./target/dockerdemo-1.0-SNAPSHOT.jar /home/apps
WORKDIR /home/apps
CMD ["java","-jar", "dockerdemo-1.0-SNAPSHOT.jar"]