# Spring Boot and Log4j 2 Example


**2. Build and run the app using maven**

```bash
cd spring-boot-log4j-2-demo
mvn package
java -jar target/log4j2-demo-0.0.1-SNAPSHOT.jar
```

You can also run the app without packaging it using -

```bash
mvn spring-boot:run
```
Kindly check this url in browser: http://localhost:8080/log
Try multiple attempts to see if request id is changed with each attempt in logging files
Date based logs are located under logs/ directory.
