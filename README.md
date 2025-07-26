Here’s an improved, professional, and visually clean version of your **Smart Contact Manager (SCM) 2.0** `README.md`. I’ve fixed your Markdown syntax issues (especially broken image links), enhanced formatting, added clickable links, and optimized wording for clarity.

---

# 📇 Smart Contact Manager (SCM) 2.0

<p align="center">
  <img src="https://i.imgur.com/Qh4J3dE.png" alt="SCM 2.0 Logo" width="150"/>
</p>

<h1 align="center">SCM 2.0 - Smart Contact Manager</h1>

<p align="center">
  A modern, secure, and user-friendly web application for managing your contacts in the cloud.<br>
  Built with a robust backend using Spring Boot and a dynamic frontend using Thymeleaf and Tailwind CSS.
</p>

<p align="center">
  <img src="https://img.shields.io/badge/Java-17-blue" alt="Java 17"/>
  <img src="https://img.shields.io/badge/Spring%20Boot-3.2.5-brightgreen" alt="Spring Boot 3.2.5"/>
  <img src="https://img.shields.io/badge/MySQL-8.0-orange" alt="MySQL 8.0"/>
  <img src="https://img.shields.io/badge/Thymeleaf-3.1-green" alt="Thymeleaf 3.1"/>
  <img src="https://img.shields.io/badge/Tailwind%20CSS-3.4.3-blueviolet" alt="Tailwind CSS 3.4.3"/>
  <img src="https://img.shields.io/badge/Docker-compose-blue" alt="Docker Compose"/>
</p>

---

## ✨ Features

* 🔐 **User Authentication** — Secure registration with email verification & login. OAuth2 support for Google and GitHub.
* 📇 **Contact Management** — Full CRUD operations for contacts.
* 🔍 **Search Functionality** — Search contacts by name, email, or phone number.
* 🙋 **User Profile** — View and manage user profile details.
* ☁️ **Cloud Image Upload** — Upload contact images to Cloudinary.
* 📱 **Responsive UI** — Designed with Tailwind CSS for mobile-first responsiveness.
* 🛡️ **Role-Based Access Control** — Secure route access based on user roles.
* 🌐 **RESTful API** — Exposes endpoints for accessing contact data.

---

## 📸 Screenshots

|                                 Dashboard                                |                                 Contacts List                                |                                 Add Contact                                |
| :----------------------------------------------------------------------: | :--------------------------------------------------------------------------: | :------------------------------------------------------------------------: |
| <img src="https://i.imgur.com/k9gH4HZ.png" alt="Dashboard" width="300"/> | <img src="https://i.imgur.com/rN4n391.png" alt="Contacts List" width="300"/> | <img src="https://i.imgur.com/L1dF1J7.png" alt="Add Contact" width="300"/> |

---

## 🛠️ Tech Stack

| Category             | Technology             | Version |
| -------------------- | ---------------------- | ------- |
| **Backend**          | Java                   | 17      |
|                      | Spring Boot            | 3.2.5   |
|                      | Spring Data JPA        | —       |
|                      | Spring Security        | —       |
|                      | Spring Mail            | —       |
|                      | OAuth2                 | —       |
| **Frontend**         | Thymeleaf              | —       |
|                      | Tailwind CSS           | 3.4.3   |
| **Database**         | MySQL                  | 8.0     |
| **Image Storage**    | Cloudinary             | —       |
| **Build Tool**       | Maven                  | —       |
| **Containerization** | Docker, Docker Compose | —       |

---

## 🚀 Getting Started

### ✅ Prerequisites

* Java 17+
* Maven 3.8+
* MySQL 8.0+
* Docker (optional but recommended)

---

### ▶️ Run with Docker (Recommended)

```bash
git clone https://github.com/satyamkumark1/scm2.0-2.git
cd scm2.0-2
docker-compose up --build
```

* App: [http://localhost:8082](http://localhost:8082)
* DB (MySQL): port `3307`
* phpMyAdmin: [http://localhost:8081](http://localhost:8081)

---

### ⚙️ Manual Setup

```bash
git clone https://github.com/satyamkumark1/scm2.0-2.git
cd scm2.0-2
```

1. **Create MySQL Database**

   * Name: `scm20` (default)
   * Update credentials in:
     `src/main/resources/application.properties`

2. **Configure Properties**

   * Optional: Setup Cloudinary, email, and OAuth2 in
     `application-dev.properties` & `application-prod.properties`

3. **Build & Run**

   ```bash
   mvn clean install
   mvn spring-boot:run
   ```

   * App: [http://localhost:8081](http://localhost:8081)

---

## 📁 Project Structure

```
.
├── docker-compose.yml
├── pom.xml
└── src
    ├── main
    │   ├── java
    │   │   └── com.scm
    │   │       ├── Application.java
    │   │       ├── config
    │   │       ├── controllers
    │   │       ├── entities
    │   │       ├── forms
    │   │       ├── helpers
    │   │       ├── repositories
    │   │       └── services
    │   └── resources
    │       ├── application.properties
    │       ├── static
    │       └── templates
    └── test
```

---

## 📡 API Endpoints

| Method | Endpoint                     | Description          |
| ------ | ---------------------------- | -------------------- |
| `POST` | `/do-register`               | Register new user    |
| `POST` | `/authenticate`              | Login                |
| `POST` | `/user/contacts/add`         | Add contact          |
| `GET`  | `/user/contacts`             | List contacts        |
| `GET`  | `/user/contacts/search`      | Search contacts      |
| `GET`  | `/user/contacts/view/{id}`   | View contact details |
| `POST` | `/user/contacts/update/{id}` | Update contact       |
| `GET`  | `/user/contacts/delete/{id}` | Delete contact       |
| `GET`  | `/api/contacts/{id}`         | Get contact via API  |

---

## 🤝 Contributing

Contributions are welcome!
Feel free to open issues or submit a pull request if you have ideas, fixes, or improvements.

---

## 📄 License

Licensed under the [Apache License 2.0](https://www.apache.org/licenses/LICENSE-2.0).
See `mvnw` and `mvnw.cmd` for further details.

---

Would you like me to:

* Convert this to a downloadable `README.md` file?
* Add badges for build status, code quality, etc.?
* Help generate GitHub Actions CI/CD for it?

Let me know!


## 📄 License

This project is licensed under the Apache License 2.0. See the `mvnw.cmd` and `mvnw` files for more details.
