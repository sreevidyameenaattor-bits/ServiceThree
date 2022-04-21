FROM openjdk:12
EXPOSE 8084
COPY target/*.jar gamma.jar
ENTRYPOINT ["java","-jar","/gamma.jar"]
