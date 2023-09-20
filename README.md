# <h1 align="center"> Instagram Back-end Application </h1>
___ 
<p align="center">
    <img alt="Java" src="https://img.shields.io/badge/Java->=8-darkblue.svg" />
    <img alt="Maven" src="https://img.shields.io/badge/maven-4.0-brightgreen.svg" />
    <img alt="Spring Boot" src="https://img.shields.io/badge/Spring Boot-3.1.3-brightgreen.svg" />
    <img alt="H2 Database" src="https://img.shields.io/badge/H2%20Database-embedded-orange.svg" />
    <img alt = "GPL v3" src="https://img.shields.io/badge/License-GPLv3-blue.svg" />
    
</p>


---

<p align="left">

## Overview

The Instagram Backend Application is a robust and scalable Spring Boot-based backend system designed to power a social media platform with features similar to Instagram. It provides a comprehensive set of RESTful API endpoints for user management, post creation, commenting, liking, and more.

## Technologies Used

- **Framework:** Spring Boot
- **Language:** Java
- **Build Tool:** Maven



## Dependencies Used

- **Spring Boot (3.1.1):** The core framework for building Spring applications, providing a wide range of features, including Spring Security and Spring Data JPA.

- **Spring Security:** Ensures secure authentication and authorization for API endpoints, protecting user data.

- **Spring Data JPA:** Provides support for easy interaction with the relational database, simplifying data access and persistence.

- **Java (>=8):** The programming language used for developing the application, offering robust performance and compatibility.

- **Maven (4.0):** The build tool used for managing project dependencies and building the application.

- **H2 Database (Runtime Scope):** An in-memory database used for development and testing, ensuring data integrity.

- **Lombok (Optional):** A library that simplifies Java code by generating boilerplate code, enhancing code readability and maintainability.

- **Other Dependencies:** Various other dependencies are included in the `pom.xml` file for specific functionalities, such as Jackson for JSON serialization, Spring Web for web-related features, and more.

Please refer to the project's `pom.xml` file for a comprehensive list of all dependencies and their respective versions.

These dependencies form the foundation of the Instagram Backend Application, allowing it to deliver robust user management and social media features efficiently.

  ## Dependencies Imported to Spring Initializr


- **Spring Boot Dev Tools:** Spring Boot Dev Tools is used for hot swapping and faster development. It helps in improving the development experience.

  [![Spring Boot Dev Tools](https://img.shields.io/badge/Spring%20Boot%20Dev%20Tools-2.5.5-brightgreen.svg)](https://spring.io/projects/spring-boot)

- **Spring Web:** Spring Web is the core part of the Spring Framework, providing support for building web applications. It's used for handling HTTP requests and responses.

  [![Spring Web](https://img.shields.io/badge/Spring%20Web-5.3.10-brightgreen.svg)](https://spring.io/guides/gs/spring-boot/)

- **Spring Data JPA:** Spring Data JPA simplifies database access with the Java Persistence API (JPA). It provides easy access to data repositories.

  [![Spring Data JPA](https://img.shields.io/badge/Spring%20Data%20JPA-2.5.5-brightgreen.svg)](https://spring.io/projects/spring-data-jpa)

- **MySQL Driver:** MySQL Driver is used for connecting the application to a MySQL database. It allows seamless interaction with the database.

  [![MySQL Driver](https://img.shields.io/badge/MySQL%20Driver-8.0.27-brightgreen.svg)](https://dev.mysql.com/downloads/connector/j/)

- **Lombok:** Lombok is a Java library that helps reduce boilerplate code by automatically generating getters, setters, and other commonly used methods.

  [![Lombok](https://img.shields.io/badge/Lombok-1.18.22-brightgreen.svg)](https://projectlombok.org/)

- **Validation:** The Validation framework provides validation constraints, such as @NotNull, @Size, and @Email, to enforce data integrity.

  [![Validation](https://img.shields.io/badge/Validation-2.0.1-brightgreen.svg)](https://docs.oracle.com/javaee/7/api/javax/validation/constraints/package-summary.html)

- **Swagger:** Swagger is used for API documentation and testing. It provides a user-friendly interface to interact with the RESTful APIs.

  [![Swagger](https://img.shields.io/badge/Swagger-3.0.0-brightgreen.svg)](https://swagger.io/)


## Project Structure

The project follows a clean and organized structure:

- **Main Application Class:** `InstagramBackendApplication.java` serves as the entry point for the Spring Boot application.
- **Entities:** The application includes entities for `User`, `Post`, `Comment`, and `Like`, each with corresponding repository interfaces.
- **Security Configuration:** Spring Security is employed to secure the application with authentication and authorization.
- **Database Configuration:** The `application.properties` file configures the database connection and Spring Data JPA properties.
- **Controller Classes:** These classes define and document the RESTful API endpoints for user management, posts, comments, and likes.
- **Service Classes:** Business logic is implemented in service classes, ensuring separation of concerns.
- **Repository Interfaces:** Spring Data JPA repository interfaces manage data access to the underlying database.


  ## Data Flow

The Instagram Backend Application follows a structured data flow that encompasses user management, post creation, commenting, and liking. Here's an overview of how data flows through the application:

1. **User Registration and Authentication:**

   - Users start by registering accounts using their email and password.
   - The application securely stores user credentials.
   - Upon subsequent visits, users authenticate themselves using their registered credentials.
   - Spring Security manages user authentication and authorization.

2. **User Profile Management:**

   - Authenticated users can update their profiles, including usernames, profile pictures, and bios.
   - User profiles are stored as `User` entities in the database.

3. **Post Creation and Retrieval:**

   - Authenticated users can create posts, including images and captions.
   - Posts are stored as `Post` entities in the database.
   - Users can retrieve their own posts and posts from profiles they follow.
   - Public posts are accessible to all users.

4. **Commenting on Posts:**

   - Users can comment on posts created by themselves or others.
   - Comments are stored as `Comment` entities in the database.
   - Users can view comments associated with each post.

5. **Liking Posts:**

   - Users can like posts, indicating their appreciation.
   - Likes are stored as `Like` entities in the database.
   - Users can see the number of likes for each post.

6. **Security:**

   - Spring Security ensures secure access to user data and endpoints.
   - Passwords are securely hashed and stored.
   - Authentication tokens are generated and validated for secure API access.

7. **Data Persistence:**

   - User profiles, posts, comments, and likes are persisted in a relational database.
   - The application uses JPA (Java Persistence API) for database operations.
   - Entities are mapped to database tables for data storage.

8. **RESTful API Endpoints:**

   - The application exposes RESTful API endpoints to interact with user data, posts, comments and likes.
   - Each endpoint is documented and adheres to REST principles.



## RESTful API Endpoints

The application provides a wide range of RESTful API endpoints for social media functionalities:

### User Management

- **Register User:** `POST /api/users/register`
- **Login User:** `POST /api/users/login`
- **Get User Profile:** `GET /api/users/{userId}`
- **Update User Profile:** `PUT /api/users/{userId}`
- **Delete User Account:** `DELETE /api/users/{userId}`

### Post Management

- **Create Post:** `POST /api/posts`
- **Get All Posts:** `GET /api/posts`
- **Get Post by ID:** `GET /api/posts/{postId}`
- **Update Post:** `PUT /api/posts/{postId}`
- **Delete Post:** `DELETE /api/posts/{postId}`

### Comment Management

- **Add Comment:** `POST /api/comments`
- **Get Comments for Post:** `GET /api/comments/{postId}`
- **Update Comment:** `PUT /api/comments/{commentId}`
- **Delete Comment:** `DELETE /api/comments/{commentId}`

### Like Management

- **Like Post:** `POST /api/likes/{postId}`
- **Get Likes for Post:** `GET /api/likes/{postId}`
- **Unlike Post:** `DELETE /api/likes/{postId}`

The API endpoints are fully documented and support the core features of a social media platform.

## Database Design

The application employs a relational database design with tables for user profiles, posts, comments, and likes. Key attributes include:

### User Table

| Column Name        | Data Type       | Description                           |
| ------------------ | --------------- | ------------------------------------- |
| userId             | INT             | Unique identifier for each user       |
| username           | VARCHAR(255)    | User's username                        |
| email              | VARCHAR(255)    | User's email address                   |
| profilePictureUrl  | VARCHAR(255)    | URL to the user's profile picture     |

### Post Table

| Column Name        | Data Type       | Description                           |
| ------------------ | --------------- | ------------------------------------- |
| postId             | INT             | Unique identifier for each post       |
| userId             | INT             | User ID of the post creator           |
| caption            | TEXT            | Caption for the post                  |
| imageUrl           | VARCHAR(255)    | URL to the post image                  |

### Comment Table

| Column Name        | Data Type       | Description                           |
| ------------------ | --------------- | ------------------------------------- |
| commentId          | INT             | Unique identifier for each comment    |
| userId             | INT             | User ID of the comment creator        |
| postId             | INT             | Post ID to which the comment belongs  |
| text               | TEXT            | Text of the comment                   |

### Like Table

| Column Name        | Data Type       | Description                           |
| ------------------ | --------------- | ------------------------------------- |
| likeId             | INT             | Unique identifier for each like       |
| userId             | INT             | User ID of the like creator           |
| postId             | INT             | Post ID to which the like belongs     |


## Database Details

The Instagram Backend Application utilizes a MySQL database to persist user data, posts, comments, likes, and other relevant information. Here are the key details about the database:

- **Database Engine:** MySQL
- **Database Schema:** InstagramDB

### Schema Design

The application's database is designed with several tables to store various types of data:

1. **Users Table (`user`):**

   - Stores user profile information, including user ID, username, email, password, profile picture URL, and bio.
   - Manages user registration, authentication, and profile management.

2. **Posts Table (`post`):**

   - Contains posts created by users, including post ID, user ID (foreign key), image URL, caption, and creation timestamp.
   - Handles the creation and retrieval of user posts.

3. **Comments Table (`comment`):**

   - Stores comments made on posts, with fields such as comment ID, user ID (foreign key), post ID (foreign key), comment text, and creation timestamp.
   - Manages the interaction between users on post comments.

4. **Likes Table (`like`):**

   - Records user likes on posts, including like ID, user ID (foreign key), post ID (foreign key), and creation timestamp.
   - Tracks user engagement and post popularity.

5. **Followers Table (`follower`):**

   - Manages user following relationships, with fields for follower ID (the user who follows) and followee ID (the user being followed).
   - Supports user interaction, such as viewing followed users' posts.

### Entity Relationships

The database tables are linked through foreign key relationships to maintain data integrity:

- The `user` table is referenced by the `post`, `comment`, and `like` tables to associate user data with posts, comments, and likes.
- The `follower` table establishes user-following relationships, allowing users to follow and view posts from other users.

This schema design ensures that user data, posts, comments, and likes are logically organized and can be efficiently queried for various application features.

### Database Configuration

The database connection properties are specified in the `application.properties` file, including the database URL, username, and password. Here is an example configuration for MySQL:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/InstagramDB
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.datasource.driverClassName=com.mysql.cj.jdbc.Driver
spring.jpa.database-platform=org.hibernate.dialect.MySQLDialect
```

Make sure to replace `your_username` and `your_password` with your actual MySQL credentials.

The database schema (`InstagramDB`) is automatically created based on the entity mappings defined in the application. Hibernate, coupled with Spring Data JPA, handles the database schema generation and management.

Please note that the exact database configuration may vary based on your specific MySQL setup and requirements. Ensure that your MySQL server is running and accessible before launching the application.

## Data Structures Used

The project utilizes the following data structures:

### User Class

The `User` class defines the structure for user data and includes the following fields:

- `userId` (User ID): An integer that serves as a unique identifier for each user.
- `username` (Username): A string representing the user's username.
- `email` (Email): A string containing the user's email address.
- `profilePictureUrl` (Profile Picture URL): A string with the URL to the user's profile picture.

### Post Class

The `Post` class defines the structure for post data and includes the following fields:

- `postId` (Post ID): An integer that serves as a unique identifier for each post.
- `userId` (User ID): An integer indicating the user who created the post.
- `caption` (Caption): A text field representing the caption for the post.
- `imageUrl` (Image URL): A string with the URL to the post's image.

### Comment Class

The `Comment` class defines the structure for comment data and includes the following fields:

- `commentId` (Comment ID): An integer that serves as a unique identifier for each comment.
- `userId` (User ID): An integer indicating the user who created the comment.
- `postId` (Post ID): An integer indicating the post to which the comment belongs.
- `text` (Text): A text field representing the content of the comment.

### Like Class

The `Like` class defines the structure for like data and includes the following fields:

- `likeId` (Like ID): An integer that serves as a unique identifier for each like.
- `userId` (User ID): An integer indicating the user who created the like.
- `postId` (Post ID): An integer indicating the post to which the like belongs.

### ArrayList

The project utilizes the `ArrayList` data structure to manage lists of entities efficiently in various parts of the application. `ArrayList` provides dynamic sizing and efficient element retrieval, making it suitable for storing and processing user profiles, posts, comments, and likes.

These data structures enable the application to efficiently organize and manipulate user data while maintaining data integrity.

## Project Summary

The Instagram Backend Application is a powerful Spring Boot-based backend system designed to support a social media platform similar to Instagram. It offers a comprehensive set of RESTful API endpoints for user management, post creation, commenting, liking, and more.

### Key Technologies Used

- **Framework:** Spring Boot
- **Language:** Java
- **Build Tool:** Maven


### Project Structure

The project follows a well-structured architecture, promoting clean code and separation of concerns. It includes entities, controllers, services, and repositories for different aspects of the application.


### RESTful API Endpoints

The application provides a comprehensive set of RESTful API endpoints to handle user management, posts, comments and likes. Each endpoint is documented and supports the core features of a social media platform.

### Database Design

The application employs a relational database design with tables for user profiles, posts, comments, and likes. This design ensures data integrity and provides a structured approach to managing user-generated content.

### Data Structures Used

The project utilizes data structures such as the `User`, `Post`, `Comment`, and `Like` classes, along with `ArrayLists`, to efficiently manage and process user data.

### Key Features

- User registration and login
- User profile management
- Post-creation, retrieval, and modification
- Commenting on posts
- Liking posts
- Robust security with Spring Security
- Well-structured codebase with clean separation of concerns

The Instagram Backend Application serves as a solid foundation for building and extending social media platforms. It demonstrates best practices in Spring Boot application development and offers a powerful backend solution for your social media project.

<!-- License -->
## License

This project is licensed under the [GNU General Public License v3.0](LICENSE).

<!-- Acknowledgments -->
## Acknowledgments

We would like to express our gratitude to the Spring Boot and Java communities for providing excellent tools, frameworks, and resources that have contributed to the development of this project.

<!-- Contact -->
## Contact

For questions or feedback, please contact [Amit Ashok Swain](mailto:business.amitswain@gmail.com).
