#!/bin/bash

docker-compose -f ../msv-db/docker/docker-compose.yml stop
docker-compose -f ../msv-db/docker/docker-compose.yml up -d 

alive_mysql=0
while [ $alive_mysql -lt 1 ]
do
    docker-compose -f ../msv-db/docker/docker-compose.yml exec msv_mysql mysql -u root -ppassword -e'select 1'  > /dev/null 2>&1
    if [ $? -eq 0 ]; then
        alive_mysql=1
    fi
    sleep 2
done

sh ./gradlew :msv-db:flywayClean
sh ./gradlew :msv-db:flywayMigrate
#sh ./gradlew flywayMigrate -Dflyway.locations=classpath:testdata

