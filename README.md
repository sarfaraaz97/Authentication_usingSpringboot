# Authentication using Spring Boot

## Overview
This project implements user authentication using **Spring Boot** for the backend and a frontend built with **TypeScript**. It provides user registration, login, and authentication functionalities with secure password management.

## Features
- User Registration
- User Login with JWT Authentication
- Secure Password Hashing
- Role-Based Authorization
- RESTful APIs for Authentication
- Spring Security Integration

## Tech Stack
### Backend:
- **Java**
- **Spring Boot**
- **Spring Security**
- **JWT (JSON Web Token)**
- **Hibernate (JPA)**
- **PostgreSQL / MySQL (Database)**

### Frontend:
- **TypeScript**
- **React.js**

## Installation & Setup

### Backend Setup:
1. **Clone the repository:**
   ```sh
   git clone https://github.com/sarfaraaz97/Authentication_usingSpringboot.git
   cd Authentication_usingSpringboot/backend
   ```
2. **Configure the database in `application.properties`:**
   ```properties
   spring.datasource.url=jdbc:postgresql://localhost:5432/auth_db
   spring.datasource.username=your_db_username
   spring.datasource.password=your_db_password
   ```
3. **Run the application:**
   ```sh
   mvn spring-boot:run
   ```

### Frontend Setup:
1. **Navigate to the frontend directory:**
   ```sh
   cd ../frontend
   ```
2. **Install dependencies:**
   ```sh
   npm install
   ```
3. **Start the frontend application:**
   ```sh
   npm start
   ```

## API Endpoints

| Method | Endpoint           | Description          |
|--------|-------------------|----------------------|
| `POST` | `/register`       | Register new user   |
| `POST` | `/login`          | User login (JWT)    |
| `GET`  | `/user/profile`   | Get user details    |

## Security Measures
- **Passwords** are hashed using **BCrypt**.
- **JWT tokens** are used for authentication.
- **Spring Security** is configured for role-based access control.

## Future Enhancements
- OAuth2 / Google & Facebook Authentication
- Email Verification
- Multi-Factor Authentication (MFA)

## Contributing
Feel free to contribute by submitting **pull requests** or opening **issues**.


