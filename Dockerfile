FROM openjdk:8-jdk-alpine
#RUN addgroup -S spring && adduser -S spring -G spring
RUN apk add curl
#USER spring:spring
ARG DEPENDENCY=target

COPY $DEPENDENCY/gs-spring-boot-docker-0.1.0.jar /app/lib/gs-spring-boot-docker-0.1.0.jar
ENTRYPOINT ["/usr/bin/java", "-jar", "/app/lib/gs-spring-boot-docker-0.1.0.jar"]
