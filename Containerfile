FROM registry.access.redhat.com/ubi8/openjdk-11:latest


ARG JAR_FILE=build/libs/demo-gradle-0.0.1-SNAPSHOT.jar


COPY ${JAR_FILE} /deployments/demo.jar

EXPOSE 8082

ENTRYPOINT ["java","-jar","/deployments/demo.jar"]
