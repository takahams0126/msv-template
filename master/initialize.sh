#!/bin/bash
DIR=`echo $(cd $(dirname $0)/../jdk/amazon-corretto-11 && pwd)`
JAVA_HOME=`echo $DIR | sed -e 's/^\/\([a-zA-Z]\)\//\1:\\\\/' | sed -e 's/\//\\\\/g'`

sh ./gradlew --stacktrace initializeWorkspace
sh ./gradlew --stacktrace :msv-service1:eclipse

