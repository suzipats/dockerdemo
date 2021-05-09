FROM openjdk:8
RUN mkdir -p /home/apps
RUN mkdir -p /home/logs
COPY ./target/dockerdemo-1.0-SNAPSHOT.jar /home/apps
WORKDIR /home/apps
#CMD ["java","-jar", "dockerdemo-1.0-SNAPSHOT.jar"]
COPY ./src/main/bin/startup.sh /home/apps/startup.sh
RUN apt-get update
RUN apt-get install -y dos2unix
RUN dos2unix /home/apps/startup.sh
RUN chmod +x /home/apps/startup.sh
ENTRYPOINT ["/home/apps/startup.sh"]
