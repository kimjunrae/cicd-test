FROM openjdk:8u212-jre-alpine3.9

RUN apk add tzdata

ENV LANG zh_CN.UTF-8
ENV LANGUAGE zh_KR.UTF-8
ENV LC_ALL zh_KR.UTF-8
ENV TZ=Asia/Seoul


RUN mkdir -p /demo/api
COPY target/demo-0.0.1-SNAPSHOT.war  /demo/api/demo.war

CMD java $JAVA_OPTIONS -jar /demo/api/demo.war