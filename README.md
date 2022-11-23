## cocktail-demo

For examples
| ENV | Description
| --- | ---
| IMAGE | 실행 이미지 (ex : nginx:latest)
| CONTAINER_NAME | 컨테이너 명 (ex : notebook)
| COMMANDS | 컨테이너 실행 사용되는 명령어들 (ex : pwd , cd test, ls -al)
| ENVIRONMENT_VARIABLES | 컨테이너 실행시 사용되는 환경 변수 (ex : TEST=test,MODE=prod)
| CONTAINER_VOLUME_PATH | 컨테이너 실행시 마운트 시킬 경로 (dind 서버 경로는 /data 로 매핑 된다.)



## Quickstart

### Docker
```text
## 이미지 생성 명령어
docker build -t web-server:0.1 .

### 컨테이너 실행 명령
docker run -d --name web-server -p 80:80 web-server:0.1

### 컨테이너 로그 보기
docker logs -f web-server

### 컨테이너 접속 명령어
docker exec -it web-server /bash
```

### Dockerfile

```dockerfile
FROM openjdk:8u212-jre-alpine3.9

RUN apk add tzdata

ENV LANG zh_CN.UTF-8
ENV LANGUAGE zh_KR.UTF-8
ENV LC_ALL zh_KR.UTF-8
ENV TZ=Asia/Seoul


RUN mkdir -p /demo/api
COPY target/demo-0.0.1-SNAPSHOT.war  /demo/api/demo.war

CMD java $JAVA_OPTIONS -jar /demo/api/demo.war
```
