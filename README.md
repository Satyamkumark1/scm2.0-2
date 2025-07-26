# Smart Contact Manager (SCM) 2.0

\<p align="center"\>
\<img src="[https://i.imgur.com/Qh4J3dE.png](https://www.google.com/search?q=https://i.imgur.com/Qh4J3dE.png)" alt="SCM 2.0 Logo" width="150"/\>
\</p\>

\<h1 align="center"\>SCM 2.0 - Smart Contact Manager\</h1\>

\<p align="center"\>
A modern, secure, and user-friendly web application for managing your contacts on the cloud. Built with a robust backend using Spring Boot and a dynamic frontend with Thymeleaf and Tailwind CSS.
\</p\>

\<p align="center"\>
\<img src="[https://img.shields.io/badge/Java-17-blue](https://www.google.com/search?q=https://img.shields.io/badge/Java-17-blue)" alt="Java 17"\>
\<img src="[https://img.shields.io/badge/Spring%20Boot-3.2.5-brightgreen](https://www.google.com/search?q=https://img.shields.io/badge/Spring%2520Boot-3.2.5-brightgreen)" alt="Spring Boot 3.2.5"\>
\<img src="[https://img.shields.io/badge/MySQL-8.0-orange](https://www.google.com/search?q=https://img.shields.io/badge/MySQL-8.0-orange)" alt="MySQL 8.0"\>
\<img src="[https://img.shields.io/badge/Thymeleaf-3.1-green](https://www.google.com/search?q=https://img.shields.io/badge/Thymeleaf-3.1-green)" alt="Thymeleaf 3.1"\>
\<img src="[https://img.shields.io/badge/Tailwind%20CSS-3.4.3-blueviolet](https://www.google.com/search?q=https://img.shields.io/badge/Tailwind%2520CSS-3.4.3-blueviolet)" alt="Tailwind CSS 3.4.3"\>
\<img src="[https://img.shields.io/badge/Docker-compose-blue](https://www.google.com/search?q=https://img.shields.io/badge/Docker-compose-blue)" alt="Docker"\>
\</p\>

## ✨ Features

  - **User Authentication**: Secure user registration with email verification and login. Supports OAuth2 for authentication with Google and GitHub.
  - **Contact Management**: A comprehensive CRUD (Create, Read, Update, Delete) functionality for contacts.
  - **Search**: Easily search for contacts by name, email, or phone number.
  - **User Profile**: A dedicated profile page for each user to view their information.
  - **Cloud Image Upload**: Upload contact pictures that are stored on Cloudinary.
  - **Responsive UI**: A responsive and modern UI built with Thymeleaf and Tailwind CSS.
  - **Role-Based Access Control**: Secure endpoints and functionalities based on user roles.
  - **RESTful API**: Exposes a RESTful API for fetching contact data.

## 📸 Screenshots

| Dashboard | Contacts List | Add Contact |
| :---: | :---: | :---: |
| \<img src="[https://i.imgur.com/k9gH4HZ.png](https://www.google.com/search?q=https://i.imgur.com/k9gH4HZ.png)" alt="Dashboard Screenshot" width="300"\> | \<img src="[https://i.imgur.com/rN4n391.png](https://www.google.com/search?q=https://i.imgur.com/rN4n391.png)" alt="Contacts List Screenshot" width="300"\> | \<img src="[https://i.imgur.com/L1dF1J7.png](https://www.google.com/search?q=https://i.imgur.com/L1dF1J7.png)" alt="Add Contact Screenshot" width="300"\> |
| **User Dashboard** | **Paginated list of contacts** | **Form to add a new contact** |

## 🛠️ Tech Stack

| Category | Technology | Version |
| :--- | :--- | :--- |
| **Backend** | Java | 17 |
| | Spring Boot | 3.2.5 |
| | Spring Data JPA| |
| | Spring Security| |
| | Spring Mail | |
| | OAuth2 | |
| **Frontend** | Thymeleaf | |
| | HTML | |
| | CSS (Tailwind CSS) | |
| **Database** | MySQL | 8 |
| **Image Storage**| Cloudinary | |
| **Build Tool** | Maven | |
| **Containerization**| Docker | |

## 🚀 Getting Started

### Prerequisites

  * Java 17+
  * Maven 3.8+
  * MySQL 8.0+
  * Docker (for running with Docker Compose)

### Running with Docker (Recommended)

This is the easiest way to get the application up and running.

1.  **Clone the repository:**

    ```bash
    git clone https://github.com/satyamkumark1/scm2.0-2.git
    cd scm2.0-2
    ```

2.  **Run with Docker Compose:**

    ```bash
    docker-compose up --build
    ```

    The application will be available at [http://localhost:8082](https://www.google.com/search?q=http://localhost:8082). The database will be running on port 3307 and phpMyAdmin will be on port 8081.

### Manual Installation

1.  **Clone the repository:**

    ```bash
    git clone https://github.com/satyamkumark1/scm2.0-2.git
    cd scm2.0-2
    ```

2.  **Database Setup:**

      * Create a MySQL database (the default is `scm20`).
      * Update `src/main/resources/application.properties` with your database credentials if they are different from the defaults.

3.  **Configuration:**

      * (Optional) Configure Cloudinary, email, and OAuth2 settings in `src/main/resources/application-dev.properties` and `src/main/resources/application-prod.properties`.

4.  **Build & Run:**

    ```bash
    mvn clean install
    mvn spring-boot:run
    ```

    The application will be available at [http://localhost:8081](https://www.google.com/search?q=http://localhost:8081).

## 📁 Project Structure

```
.
├── docker-compose.yml
├── pom.xml
└── src
    ├── main
    │   ├── java
    │   │   └── com
    │   │       └── scm
    │   │           ├── Application.java
    │   │           ├── config
    │   │           ├── controllers
    │   │           ├── entities
    │   │           ├── forms
    │   │           ├── helpers
    │   │           ├── repsitories
    │   │           └── services
    │   └── resources
    │       ├── application.properties
    │       ├── static
    │       └── templates
    └── test
```

## 📡 API Endpoints

| Method | Endpoint | Description |
| :--- | :--- | :--- |
| `POST` | `/do-register` | Registers a new user. |
| `POST` | `/authenticate`| Authenticates a user. |
| `POST` | `/user/contacts/add` | Adds a new contact. |
| `GET` | `/user/contacts` | Displays all contacts for the logged-in user. |
| `GET` | `/user/contacts/search`| Searches for contacts. |
| `POST`| `/user/contacts/update/{contactId}`| Updates a contact.|
| `GET` | `/user/contacts/view/{contactId}` | Displays the form to update a contact.|
|`GET`| `/user/contacts/delete/{contactId}`| Deletes a contact.|
| `GET`| `/api/contacts/{contactId}`| Retrieves contact data via API.|

## 🤝 Contributing

Pull requests are welcome\! For major changes, please open an issue first to discuss what you would like to change.

## 📄 License

This project is licensed under the Apache License 2.0. See the `mvnw.cmd` and `mvnw` files for more details.
