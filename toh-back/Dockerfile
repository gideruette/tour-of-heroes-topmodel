FROM maven:3-openjdk-17
WORKDIR /toh
ADD ./target/toh.jar /toh/toh.jar
ENTRYPOINT [ "java", "-jar", "toh.jar" ]