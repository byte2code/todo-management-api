# Todo Management API

Spring Boot REST API for managing users and their todos with JPA, H2 persistence, and layered controller-service-repository design.

## Overview

This project demonstrates a compact Spring Boot API for managing users and their todo items. It is designed as a learning project that shows how one-to-many entity mapping, repository-based persistence, and basic CRUD-style REST endpoints work together in a clean, beginner-friendly structure.

## Concepts and Features Covered

- Spring Boot REST API setup
- Spring Data JPA repository pattern
- H2 in-memory database integration
- One-to-many relationship between users and todos
- `GET` endpoint for retrieving a user by ID
- `GET` endpoint for retrieving a todo by ID
- `POST` endpoint for creating a user
- `POST` endpoint for creating a todo for a specific user
- `POST` endpoint for toggling todo completion status
- `PUT` endpoint for updating users and todos
- `DELETE` endpoint for deleting a todo from a user
- `DELETE` endpoint for deleting a user

## Tech Stack

- Java 17
- Spring Boot 3
- Spring Web
- Spring Data JPA
- H2 Database
- Maven
- JUnit 5

## Project Structure

```text
todo-management-api/
├── CHANGELOG.md
├── README.md
├── pom.xml
├── mvnw
├── mvnw.cmd
└── src/
    └── main/
        ├── java/com/example/todocrud/
        │   ├── controller/
        │   ├── entity/
        │   ├── repository/
        │   ├── services/
        │   └── ToDoCrudApplication.java
        └── resources/
            └── application.yml
```

## How to Run

1. Open a terminal in the project root.
2. Run `mvn test`.
3. Run `mvn spring-boot:run`.
4. Use the API under `http://localhost:8080/users`.
5. Optional: open the H2 console if needed from the configured Spring Boot app.

Available endpoints:

- `GET /users/{userId}`
- `GET /users/todo/{todoId}`
- `POST /users`
- `POST /users/{userId}/todos`
- `POST /users/todos/{todoId}`
- `PUT /users`
- `PUT /users/todo`
- `DELETE /users/{userId}/todos/{todoId}`
- `DELETE /users/{userId}`

Example request body for creating a user:

```json
{
  "username": "ashu",
  "password": "secret123"
}
```

Example request body for creating a todo:

```json
{
  "content": "Finish Spring Boot practice task",
  "completed": false
}
```

## Learning Highlights

- Demonstrates repository-based CRUD operations with Spring Data JPA
- Shows how to model a one-to-many user and todo relationship
- Uses H2 in-memory persistence to keep setup simple for learning and demos
- Includes a focused toggle endpoint to show lightweight state updates in a REST API

## GitHub Metadata

- Suggested repository description: `Spring Boot REST API for managing users and todo items with JPA, H2 persistence, and layered controller-service-repository design.`
- Suggested topics: `java`, `java-17`, `spring-boot`, `spring-data-jpa`, `h2-database`, `rest-api`, `todo-management`, `crud-api`, `maven`, `learning-project`, `portfolio-project`
