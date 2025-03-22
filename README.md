# 📜Student Management System

## 📌 Overview
The **Student Management System** is a Java Spring Boot application with a RESTful API for managing student records. It allows users to create, retrieve, update, and delete student details. Swagger is integrated for API documentation.

---

## 🚀 Features

- ✅ CRUD Operations for Students
- 📜 Swagger API Documentation
- 🔧 Spring Boot & JPA for database management
- ⚠️ Exception Handling & Validation
- 🔒 Secure API Endpoints

---

## 🛠️ Tech Stack

- **Backend:** Java, Spring Boot, Spring Data JPA
- **Database:** MySQL/PostgreSQL/H2 (Configurable)
- **API Documentation:** Swagger (Springdoc OpenAPI)
- **Build Tool:** Maven

---

## 📂 Project Structure
```plaintext
student-management-system/
│── src/main/java/com/example/student/
│   ├── controller/         # REST Controllers
│   ├── service/            # Business Logic
│   ├── repository/         # Data Access Layer
│   ├── model/              # Entity Definitions
│   ├── exception/          # Custom Exceptions
│── src/main/resources/
│   ├── application.properties  # Configuration File
│── pom.xml                # Maven Dependencies
│── README.md              # Project Documentation
```

---

## ⚙️ Installation & Setup

### Prerequisites
- ☕ **Java 17+**
- 🛠 **Maven**
- 🗄 **MySQL**

### Steps to Run

1️⃣ **Clone the repository:**
```sh
git clone https://github.com/Vikas9kumargupta/student-management-system.git
cd student-management-system
```

2️⃣ **Configure the database in `application.properties`:**
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/student_db
spring.datasource.username=root
spring.datasource.password=yourpassword
```

3️⃣ **Build and Run the application:**
```sh
mvn clean install
mvn spring-boot:run
```

4️⃣ **Access Swagger UI at:**
```
http://localhost:8080/swagger-ui.html
```

---

## 🎯 API Endpoints

| 🔹 Method | 🔹 Endpoint | 🔹 Description |
|-----------|------------|----------------|
| **GET** | `/students` | Get all students |
| **GET** | `/students/{id}` | Get student by ID |
| **POST** | `/students` | Create a new student |
| **PUT** | `/students/{id}` | Update student details |
| **DELETE** | `/students/{id}` | Delete a student |

---

## 📖 License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---

## 📞 Contact

For any queries, feel free to reach out:

- 👨‍💻 **Developer:** Vikas Kumar Gupta
- 📧 **Email:** vikasgup074@gmail.com
- 🌐 **GitHub:** [Vikas9kumargupta](https://github.com/Vikas9kumargupta)
- 🔗 **LinkedIn:** [Work with Vikas](https://www.linkedin.com/in/work-with-vikas/)

---

🌟 *Feel free to contribute and star the repository if you find this helpful!* 🌟
