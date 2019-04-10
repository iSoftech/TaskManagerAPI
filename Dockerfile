FROM java:8
LABEL maintainer=“MohamedYusuff.M@cognizant.com”
VOLUME /tmp
EXPOSE 8080
ADD target/TaskManagerRestfulAPI-1.0.0.jar TaskManagerRestfulAPI-1.0.0.jar
ENTRYPOINT ["java","-jar","TaskManagerRestfulAPI-1.0.0.jar"]