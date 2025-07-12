📇 Smart Contact Manager 2.0
A modern, secure, and cloud-based web application for managing personal and professional contacts. Built with Spring Boot, Thymeleaf, and Tailwind CSS, SCM 2.0 offers a sleek user experience, powerful features, and secure contact management.

🚀 Features
🔐 User Authentication
Secure login and registration with BCrypt password hashing.

📒 Contact Management
Create, edit, delete, and search contacts with pagination support.

🎨 Responsive UI
Built using Tailwind CSS with dark mode support for a modern UX.

📤 Export / 📥 Import
Export contacts to CSV or import them seamlessly.

📧 Email Notifications
Automatic welcome email upon registration using Spring Mail.

🛠️ RESTful API
Access and manage contacts programmatically through REST endpoints.

📄 Static Pages
Informative About and Services pages included.

🧰 Tech Stack
Layer	Technology
Language	Java 17+
Framework	Spring Boot 3.2.0
UI Rendering	Thymeleaf
Styling	Tailwind CSS 3.4.1
Authentication	Spring Security
Database	H2 (Dev) / MySQL 8+ (Prod)
Build Tool	Maven
Emails	Spring Mail
Deployment (Optional)	Docker, Heroku, AWS Elastic Beanstalk

📁 Project Structure
bash
Copy
Edit
scm2.0-2/
├── src/
│   ├── main/
│   │   ├── java/com/scm/scm20/
│   │   │   ├── controller/       # MVC Controllers
│   │   │   ├── entities/         # JPA Entities (User, Contact)
│   │   │   ├── forms/            # Form binding DTOs
│   │   │   ├── helper/           # Utilities, exception handling
│   │   │   ├── repositories/     # Spring Data Repositories
│   │   │   └── services/         # Business Logic
│   │   └── resources/
│   │       ├── templates/        # Thymeleaf HTML templates
│   │       ├── static/           # Tailwind CSS, JS, images
│   │       └── application.properties  # Config & secrets
├── test/                         # Unit & integration tests
├── pom.xml                       # Maven build file
├── Dockerfile                    # Container configuration
├── docker-compose.yml            # Local deployment config
└── README.md                     # 📘 You're here!
🧑‍💻 Getting Started
✅ Prerequisites
Java 17+

Maven 3.6+

MySQL 8+ (for production)

Docker (optional)

🛠️ Setup
bash
Copy
Edit
# 1. Clone the repo
git clone https://github.com/your-repo/scm2.0-2.git
cd scm2.0-2

# 2. Configure Database
# For H2 (in-memory)
# No changes needed.

# For MySQL:
# In src/main/resources/application.properties
spring.datasource.url=jdbc:mysql://localhost:3306/scm_db
spring.datasource.username=root
spring.datasource.password=your_password

# 3. Build the project
./mvnw clean install

# 4. Run locally
./mvnw spring-boot:run
🌐 Open in browser
Visit: http://localhost:8080

🐳 Run with Docker
bash
Copy
Edit
docker-compose up --build
Then access the app at: http://localhost:8080

☁️ Deployment
Heroku
bash
Copy
Edit
# Create Procfile
echo "web: java -jar target/scm2.0-2-0.0.1-SNAPSHOT.jar" > Procfile

# Deploy
heroku create
git push heroku main
AWS Elastic Beanstalk
Package the JAR: ./mvnw package

Deploy via AWS Console or AWS CLI

Set environment variables for database and SMTP

🔗 Key Endpoints
URL Path	Description
/home	Home page
/about	Static About page
/services	Static Services page
/register	User registration
/login	User login
/api/contacts	REST API (CRUD contacts)

🧩 Customization Guide
UI: Modify src/main/resources/templates/ and static/ assets

Database: Update entities/ and repositories/

Email: Set SMTP configs in application.properties

🧪 Testing
Type	Command
Unit Tests	mvn test
Integration Test	mvn verify
UI Test (Cypress)	npx cypress run (optional)

🤝 Contributing
We welcome contributions! Here's how:

Fork the repository.

Create your feature branch:

bash
Copy
Edit
git checkout -b feature/your-feature
Follow Google Java Style Guide.

Write tests.

Submit a pull request with a clear description.

💬 For major features, open an issue first to discuss your proposal.

📄 License
Licensed under the MIT License.

