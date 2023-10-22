FROM openjdk:17-alpine
#修改时区
ENV TZ=Asia/Shanghai
ADD HowayRecord-access/target/HowayRecord-access-1.0.0.jar HowayRecord-access-1.0.0.jar
EXPOSE 8079
EXPOSE 20881
CMD ["java","-jar","HowayRecord-access-1.0.0.jar"]