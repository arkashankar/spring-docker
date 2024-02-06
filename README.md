1. Creart a JAVA application
2. Insert Docckerfile inside project folder
3. commands  -->FROM openjdk:17-oracle
VOLUME /temp

ADD target/AE001-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]

create docker build
docker build --> docker build -t <IMAGE_NAME> .  

docker run -p 8080:8080 --name <CONTAINER_NAME> <IMAGE_NAME>

docker ps -a #to find the container name
docker stop <CONTAINER_NAME>
