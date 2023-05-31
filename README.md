# spring-JDBC-JPA-Hibernate-spring-JPA-application
Demo project for Spring Boot with JDBC, JPA, Hiberbate and Spring JPA, H2 database

- JDBC
    - Write a lot of SQL queries
    - And write a lot of Java code
- Spring JDBC
    - Write a lot of SQL queries
    - BUT lesser Java code

- JPA
    - Do not worry about the query
    - Map Entity to table
    - Use entityManager to perform actions on an entity and manage the entity
    - JPA however, generates a query in the background for each CRUD operation

- Spring Data JPA
    - Let’s make JPA even more simple!
    - I will take care of everything! even the entityManager


Hibernate vs JPA
- JPA defines the specification. It is an API
- Hibernate is one of the most popular implementations of JPA
- We use JPA-defined APIs, but the implementation by Hibernate
- Using Hibernate directly would result in lock-in to Hibernate I.e if in future we want to use a different implementation lot of code changes are required.
- By using JPA interface APIs, Moving to a different implementation is easier.
- Other JPA implementation example is Toplink
- It is recommended to use JPA in our code instead of directly using an implementation
