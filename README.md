Smart Contact Manager 2.0

A modern, secure, and cloud-based web application for managing contacts. Built with Spring Boot, Thymeleaf, and Tailwind CSS, it offers a responsive UI, secure user authentication, and robust contact management.
Features

User Authentication: Secure registration and login with BCrypt password hashing.
Contact Management: Add, edit, delete, and search contacts with pagination.
Responsive UI: Modern, accessible design with Tailwind CSS and dark mode support.
Export/Import: Export contacts to CSV or import from CSV files.
Email Notifications: Welcome emails on registration.
REST API: Manage contacts programmatically via API endpoints.
Static Pages: About and Services pages for additional information.

Technologies Used

Java 17+ with Spring Boot 3.2.0
Maven for dependency management
Thymeleaf for server-side rendering
Tailwind CSS 3.4.1 for styling
H2/MySQL for database (configurable)
Spring Security for authentication and authorization
Spring Mail for email notifications

Project Structure
scm2.0-2/
├── src/
│   ├── main/
│   │   ├── java/com/scm/scm20/
│   │   │   ├── controller/         # Spring MVC controllers
│   │   │   ├── entities/           # JPA entities (User, Contact)
│   │   │   ├── forms/              # Form binding objects
│   │   │   ├── helper/             # Utilities and exception handling
│   │   │   ├── repositories/       # Spring Data JPA repositories
│   │   │   └── services/           # Service layer (business logic)
│   │   └── resources/
│   │       ├── templates/          # Thymeleaf HTML templates
│   │       ├── static/             # CSS, JS, images
│   │       └── application.properties  # Configuration file
│   └── test/                       # Unit and integration tests
├── pom.xml                         # Maven build file
├── Dockerfile                      # Docker configuration
├── docker-compose.yml              # Docker Compose for local deployment
└── README.md                       # Project documentation

Screenshots

Getting Started
Prerequisites

Java 17+
Maven 3.6+
MySQL 8.0+ (optional for production)
Docker (optional for containerized deployment)

Setup & Run Locally

Clone the repository:git clone https://github.com/your-repo/scm2.0-2.git
cd scm2.0-2


Configure the database:
For H2 (default, in-memory):No changes needed; H2 is configured out of the box.
For MySQL:Update src/main/resources/application.properties:spring.datasource.url=jdbc:mysql://localhost:3306/scm_db
spring.datasource.username=root
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update




Build the project:./mvnw clean install


Run the application:./mvnw spring-boot:run


Access the app:Open http://localhost:8080 in your browser.

Run with Docker

Build and run with Docker Compose:docker-compose up --build


Access the app at http://localhost:8080.

Deployment

Heroku:
Install the Heroku CLI and log in.
Create a Procfile:web: java -jar target/scm2.0-2-0.0.1-SNAPSHOT.jar


Deploy:heroku create
git push heroku main




AWS Elastic Beanstalk:
Package the app as a JAR (./mvnw package).
Use the AWS CLI or Elastic Beanstalk console to deploy the JAR.
Configure environment variables for MySQL and other settings.



Key Endpoints

/home        - Home page
/about       - About page
/services    - Services page
/register    - User registration
/login       - User login
/api/contacts - REST API for contact management (GET, POST, PUT, DELETE)

Customization

UI: Modify Thymeleaf templates in src/main/resources/templates/ and styles in src/main/resources/static/css/.
Entities: Update JPA entities in src/main/java/com/scm/scm20/entities/ and sync with forms/services.
Email: Configure SMTP settings in application.properties for email notifications.

Testing

Unit Tests: Run mvn test to execute JUnit tests for services and repositories.
Integration Tests: Use mvn verify for Spring Boot Test suite.
UI Testing: Run Cypress tests with npx cypress run.

Contributing
We welcome contributions! Please follow these steps:

Fork the repository.
Create a feature branch (git checkout -b feature/your-feature).
Follow the code style (Google Java Style Guide).
Write tests for new features.
Submit a pull request with a clear description of changes.

For major changes, open an issue first to discuss your proposal.
License
This project is licensed under the MIT License.