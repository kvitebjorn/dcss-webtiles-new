FROM openjdk:8-alpine

COPY target/uberjar/dcss-webtiles-server.jar /dcss-webtiles-server/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/dcss-webtiles-server/app.jar"]
