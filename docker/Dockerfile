FROM openjdk:8-jdk-alpine
RUN mkdir -p /usr/local/myapp/config
COPY apps/*.jar /usr/local/myapp/
ENTRYPOINT [ "sh", "-c", "java -jar /usr/local/myapp/spring-rest-crud-helloworld.jar" ]