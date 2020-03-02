cd %~dp0

CALL :SET_JAVA_HOME "..\jdk\amazon-corretto-11"

.\gradlew.bat --stacktrace initializeWorkspace :msv-service1:eclipse

:SET_JAVA_HOME
  SET JAVA_HOME=%~dpfn1
  EXIT /B
