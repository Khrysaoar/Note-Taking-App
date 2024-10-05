
# Note-Taking Application

## Overview
This is a simple backend for a note-taking application built using Spring Boot. The API allows users to create, retrieve, update, and delete notes.

## Requirements
- Java 11 or higher
- Maven

## Running the Application
To run the application, clone the repository and run the following command in the project directory:

```bash
./mvnw spring-boot:run
```

Alternatively, you can package the application and run it as a JAR:

```bash
./mvnw clean package
java -jar target/note-taking-app.jar
```

## API Endpoints
1. **POST /notes**: Create a new note.
    - **Request Body**:
    ```json
    {
      "title": "Sample Note",
      "body": "This is a sample note."
    }
    ```

2. **GET /notes**: Retrieve all notes.

3. **GET /notes/{id}**: Retrieve a specific note by its ID.

4. **PUT /notes/{id}**: Update a specific note.
    - **Request Body**:
    ```json
    {
      "title": "Updated Note",
      "body": "This is the updated content."
    }
    ```

5. **DELETE /notes/{id}**: Delete a specific note by ID.

## Error Handling
- **404 Not Found**: If a note with the specified ID is not found.
- **400 Bad Request**: For invalid input or missing required fields.

## Assumptions
- Data is stored in memory and is not persisted across application restarts.

## Author
- Keannu Brillante
