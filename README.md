# Dynamic CORS management

### Experiment Description
- In the future there will have a lot of microservices in the system
- each microservice will have its own domain name.
- each microservice will have its own CORS configuration
- this experiment is to test how to manage CORS configuration dynamically

### result
- it can add dynamic allowed cors but only allowed for one monolith client
- it will stuck on api gate way which I don't know how to config them

### Reference Documentation

For further reference, please consider the following sections:

* [Official Gradle documentation](https://docs.gradle.org)
* [Spring Boot Gradle Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.1.4/gradle-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.1.4/gradle-plugin/reference/html/#build-image)
* [GraalVM Native Image Support](https://docs.spring.io/spring-boot/docs/3.1.4/reference/html/native-image.html#native-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/3.1.4/reference/htmlsingle/index.html#web)
* [Spring Boot Actuator](https://docs.spring.io/spring-boot/docs/3.1.4/reference/htmlsingle/index.html#actuator)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/3.1.4/reference/htmlsingle/index.html#using.devtools)
* [Spring Data MongoDB](https://docs.spring.io/spring-boot/docs/3.1.4/reference/htmlsingle/index.html#data.nosql.mongodb)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/3.1.4/reference/htmlsingle/index.html#data.sql.jpa-and-spring-data)

### Guides

The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)
* [Building a RESTful Web Service with Spring Boot Actuator](https://spring.io/guides/gs/actuator-service/)
* [Accessing Data with MongoDB](https://spring.io/guides/gs/accessing-data-mongodb/)
* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)

