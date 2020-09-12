FROM openjdk:8
LABEL maintainer="arzajasmelia@gmail.com"
VOLUME /tmp
#ARG JAR_FILE = ./build/libs/springboot-cek-mutasi-0.0.1-SNAPSHOT.jar
#ADD ${JAR_FILE} springboot-cek-mutasi.jar
ADD target/springboot-cek-mutasi-0.0.1-SNAPSHOT.jar springboot-cek-mutasi-0.0.1-SNAPSHOT.jar
EXPOSE 8087
ENTRYPOINT ["java","-jar","springboot-cek-mutasi-0.0.1-SNAPSHOT.jar"]
#ENTRYPOINT ["java","-jar","project-spring-boot-0.0.1-SNAPSHOT.jar"]