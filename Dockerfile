FROM maven:3.5-jdk-8 AS build
FROM openjdk:8-jre
RUN echo 'hello'
