#fdefining base docker file
FROM adoptopenjdk/openjdk11

COPY ./target/*jar /apps/app.jar

ENTRYPOINT ["java","jar","/apps/app.jar"]

EXPOSE 8080