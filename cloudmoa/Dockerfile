FROM openjdk:8
VOLUME /tmp
ARG JAR_FILE
#COPY run.sh /
COPY ${JAR_FILE} app.jar
COPY opentracing-specialagent-1.7.1.jar /
ENTRYPOINT ["-Dsa.tracer=jaeger","-Djava.security.egd=file:/dev/./urandom","-noverify","-javaagent:/opentracing-specialagent-1.7.1.jar","-jar","/app.jar"]


# 위 내용은 고객사 상황에 따라 달라질수 있습니다.
# porting 옵션
# "-Dsa.tracer=jaeger"
# "-javaagent:/opentracing-specialagent-1.7.1.jar"