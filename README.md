# To-Do App

A simple To-Do list web application built with Spring Boot, Thymeleaf, Spring Data JPA, and MySQL.

## Features

- Add, complete, and delete tasks
- Task persistence using MySQL
- Responsive UI with Bootstrap 5
- Thymeleaf template rendering

## Project Structure

- `src/main/java/com/example/todo/`
  - `controller/TaskController.java` — Handles web requests
  - `model/Task.java` — Task entity
  - `repository/TaskRepository.java` — JPA repository
  - `service/TaskService.java` — Business logic
  - `TodoApplication.java` — Main Spring Boot entry point
- `src/main/resources/templates/index.html` — Main UI template
- `src/main/resources/application.properties` — App and DB config
- `pom.xml` — Maven dependencies and build config

## Prerequisites

- Java 17+
- Maven
- MySQL (running on `localhost:3306`, database `todo_db`)

## Setup

1. **Clone the repository**

   ```sh
   git clone <your-repo-url>
   cd todo
   ```

2. **Configure the database**

   Create a MySQL database named `todo_db` and ensure the credentials in [`src/main/resources/application.properties`](src/main/resources/application.properties) match your setup.

3. **Build and run the application**

   ```sh
   ./mvnw spring-boot:run
   ```

   Or on Windows:

   ```sh
   mvnw.cmd spring-boot:run
   ```

4. **Access the app**

   Open [http://localhost:8080](http://localhost:8080) in your browser.

## Running Tests

Run all tests with:

```sh
./mvnw test
```

## Customization

- Change database settings in [`src/main/resources/application.properties`](src/main/resources/application.properties).
- Modify the UI in [`src/main/resources/templates/index.html`](src/main/resources/templates/index.html).
