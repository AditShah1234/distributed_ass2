FROM maven:alpine as build
ENV HOME=/usr/app
RUN mkdir -p $HOME
WORKDIR $HOME
ADD . $HOME
RUN mvn package

FROM openjdk:8-jdk-alpine

WORKDIR /app

# Copy the jar file into our app
COPY . /app
RUN mvn clean install
RUN cd grpc-service
RUN mvn spring-boot:run