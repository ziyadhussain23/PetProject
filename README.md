# Pet Project - Database Management System

A comprehensive Database Management System (DBMS) project built with Spring Boot and HTML, designed to demonstrate modern web application development with robust database operations and user-friendly interfaces.

## 🐾 Project Overview

This project showcases a full-stack web application using Spring Boot for backend services and HTML for frontend presentation. It implements essential DBMS concepts including CRUD operations, data relationships, and query optimization.

## ✨ Features

- **Database Operations**: Complete CRUD (Create, Read, Update, Delete) functionality
- **Spring Boot Backend**: RESTful API with robust data handling
- **Responsive Web Interface**: Clean and intuitive HTML-based frontend
- **Data Validation**: Input validation and error handling
- **Search & Filter**: Advanced data retrieval capabilities
- **Database Relationships**: Proper foreign key relationships and joins
- **Security**: Basic authentication and authorization
- **API Documentation**: Well-documented REST endpoints

## 🛠️ Technologies Used

- **Backend**: Java with Spring Boot (32%)
  - Spring Data JPA
  - Spring Web
  - Spring Security
  - MySQL/PostgreSQL database
- **Frontend**: HTML (68%)
  - Responsive design
  - Bootstrap CSS framework
  - JavaScript for dynamic interactions

## 🚀 Getting Started

### Prerequisites

- Java Development Kit (JDK) 11 or higher
- Maven 3.6+
- MySQL or PostgreSQL database
- IDE (IntelliJ IDEA, Eclipse, or VS Code)

### Installation

1. **Clone the repository**
   ```bash
   git clone https://github.com/ziyadhussain23/PetProject.git
   cd PetProject
   ```

2. **Configure Database**
   - Create a new database
   - Update `application.properties` with your database credentials:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/petproject_db
   spring.datasource.username=your_username
   spring.datasource.password=your_password
   ```

3. **Build and Run**
   ```bash
   mvn clean install
   mvn spring-boot:run
   ```

4. **Access the Application**
   - Open your browser and navigate to `http://localhost:8080`

## 📁 Project Structure

```
PetProject/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── com/petproject/
│   │   │   │   ├── controller/
│   │   │   │   ├── model/
│   │   │   │   ├── repository/
│   │   │   │   ├── service/
│   │   │   │   └── PetProjectApplication.java
│   │   └── resources/
│   │       ├── static/
│   │       ├── templates/
│   │       └── application.properties
│   └── test/
├── target/
├── pom.xml
└── README.md
```

## 🎯 Key Features Demonstrated

### Database Operations
- **Entity Relationships**: One-to-Many, Many-to-One mappings
- **Query Methods**: Custom repository methods
- **Transactions**: Database transaction management
- **Data Persistence**: JPA/Hibernate implementation

### Web Application
- **REST APIs**: JSON-based data exchange
- **Form Handling**: Data submission and validation
- **Error Handling**: Graceful error management
- **Responsive Design**: Mobile-friendly interface

## 🔧 API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/api/pets` | Get all pets |
| GET | `/api/pets/{id}` | Get pet by ID |
| POST | `/api/pets` | Create new pet |
| PUT | `/api/pets/{id}` | Update pet |
| DELETE | `/api/pets/{id}` | Delete pet |

## 🧪 Testing

Run the test suite:
```bash
mvn test
```

## 🤝 Contributing

1. Fork the project
2. Create your feature branch (`git checkout -b feature/NewFeature`)
3. Commit your changes (`git commit -m 'Add NewFeature'`)
4. Push to the branch (`git push origin feature/NewFeature`)
5. Open a Pull Request

## 📚 Learning Objectives

This project demonstrates:
- Spring Boot application development
- Database design and implementation
- RESTful API creation
- Frontend-backend integration
- Modern web development practices

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 👨‍💻 Author

**Ziyad Hussain**
- GitHub: [@ziyadhussain23](https://github.com/ziyadhussain23)

## 🎓 Academic Context

This project was developed as part of Database Management Systems coursework, showcasing practical implementation of theoretical concepts.

---

*Last updated: May 30, 2025*
