@echo off
REM Clean and package the JAR
mvn clean package -DskipTests=true

REM Deploy to Nexus
mvn deploy -DskipTests=true