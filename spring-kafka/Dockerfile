
FROM maven:3-openjdk-17-slim AS builder

WORKDIR /home/app
# Clona la repo Git
RUN apt-get update && \
    apt-get install -y git && \
    git clone https://github.com/Thomromano30/spring_kafka.git

WORKDIR /home/app/spring_kafka/spring-kafka

RUN mvn -f /home/app/spring_kafka/spring-kafka/pom.xml clean package

FROM openjdk:17-jdk-slim
COPY --from=builder /home/app/spring_kafka/spring-kafka/target/spring-kafka-0.0.1-SNAPSHOT.jar /usr/local/lib/prova.jar
ENTRYPOINT ["java", "-jar", "/usr/local/lib/prova.jar"]

VOLUME /tmp

