FROM openjdk:14
COPY target/dependency-jars /run/dependency-jars
ADD target/application.jar /run/application.jar
ENTRYPOINT java -jar --enable-preview run/application.jar