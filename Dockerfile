FROM openjdk:17-oracle
VOLUME /temp

ADD target/AE001-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]