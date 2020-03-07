#!/bin/bash

# JAVA_HOME���v���W�F�N�g�z����JDK�ɐݒ�
DIR=`echo $(cd $(dirname $0)/../jdk/amazon-corretto-11 && pwd)`
JAVA_HOME=`echo $DIR | sed -e 's/^\/\([a-zA-Z]\)\//\1:\\\\/' | sed -e 's/\//\\\\/g'`

# vscode���[�N�X�y�[�X�ݒ��������
sh ./gradlew --stacktrace initializeWorkspace

# vscode��Java�J������v���W�F�N�g��eclipse�^�X�N�����s
# vscode�ŃN���X�p�X�Ȃǂ�F�������邽��
sh ./gradlew --stacktrace :db-core:eclipse
sh ./gradlew --stacktrace :db-custom:eclipse
sh ./gradlew --stacktrace :msv-core:eclipse
sh ./gradlew --stacktrace :msv-service1:eclipse

