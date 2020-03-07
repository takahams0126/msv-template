#!/bin/bash

# JAVA_HOMEをプロジェクト配下のJDKに設定
DIR=`echo $(cd $(dirname $0)/../jdk/amazon-corretto-11 && pwd)`
JAVA_HOME=`echo $DIR | sed -e 's/^\/\([a-zA-Z]\)\//\1:\\\\/' | sed -e 's/\//\\\\/g'`

# vscodeワークスペース設定を初期化
sh ./gradlew --stacktrace initializeWorkspace

# vscodeでJava開発するプロジェクトはeclipseタスクを実行
# vscodeでクラスパスなどを認識させるため
sh ./gradlew --stacktrace :db-core:eclipse
sh ./gradlew --stacktrace :db-custom:eclipse
sh ./gradlew --stacktrace :msv-core:eclipse
sh ./gradlew --stacktrace :msv-service1:eclipse

