FROM hcard.acloud.run/docker.io/library/mariadb:10.6

ENV TZ=Asia/Seoul

RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && \
    echo "$TZ" > /etc/timezone

ENV MYSQL_ROOT_PASSWORD "Root(2020!@)"
ENV MYSQL_DATABASE "acloud"
ENV MYSQL_USER "acloud"
ENV MYSQL_PASSWORD "Acloud(2020!@)"

#COPY my.cnf /etc/mysql/my.cnf
COPY mariadb.cnf /etc/mysql/conf.d/mariadb.cnf

COPY 01-acloud-schema.sql /docker-entrypoint-initdb.d/
COPY 02-acloud-initdata.sql /docker-entrypoint-initdb.d/