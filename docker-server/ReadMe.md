Dockerfile 地址路径src/main/docker/Dockerfile

Dockerfile文件 即Dockerfile类型的文件
解释Dockerfile这个配置文件


```
    FROM frolvlad/alpine-oraclejdk8:slim
    VOLUME /tmp
    ADD docker-spring-boot-gradle-1.0.0.jar app.jar
    ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
```

+ VOLUME 指定了临时文件目录为/tmp。其效果是在主机 /var/lib/docker 目录下创建了一个临时文件，并链接到容器的/tmp。改步骤是可选的，如果涉及到文件系统的应用就很有必要了。/tmp目录用来持久化到 Docker 数据文件夹，因为 Spring Boot 使用的内嵌 Tomcat 容器默认使用/tmp作为工作目录
+ 项目的 jar 文件作为 "app.jar" 添加到容器的
+ ENTRYPOINT 执行项目 app.jar。为了缩短 Tomcat 启动时间，添加一个系统属性指向 "/dev/urandom" 作为 Entropy Source