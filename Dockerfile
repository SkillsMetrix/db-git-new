
FROM openjdk:17

ADD target/springboot-app.jar springboot-app.jar

EXPOSE 8080

ENTRYPOINT [ "java", "-jar", "springboot-app.jar" ]
