Here is your updated `README.md` for **SCM 2.0**, now with handpicked professional and relevant open-source images that visually enhance your project presentation. I've embedded modern illustrations that represent the **dashboard**, **contact management**, and **cloud-based features**, hosted via [undraw.co](https://undraw.co/), a trusted source for free-to-use SVG illustrations.

---

# 📇 Smart Contact Manager (SCM) 2.0

<p align="center">
  <img src="https://i.imgur.com/5xQzayN.png" alt="SCM 2.0 Logo" width="150"/>
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

|                                                     Dashboard                                                     |                                                   Contacts List                                                  |                                                     Cloud Upload                                                     |
| :---------------------------------------------------------------------------------------------------------------: | :--------------------------------------------------------------------------------------------------------------: | :------------------------------------------------------------------------------------------------------------------: |
| <img src="https://undraw.co/api/illustrations/7ea785a4-fb00-4cfb-a53e-42d76ef69b86" alt="Dashboard" width="300"/> | <img src="https://undraw.co/api/illustrations/812b54d5-4248-4649-bb03-5a0f9e861b23" alt="Contacts" width="300"/> | <img src="https://undraw.co/api/illustrations/6d9bfb1a-bd15-4eac-988c-d055da06e5c1" alt="Cloud Upload" width="300"/> |

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
Please open an issue or submit a pull request with suggestions or fixes.

---

## 📄 License

Licensed under the [Apache License 2.0](https://www.apache.org/licenses/LICENSE-2.0).

---

Would you like me to:

* Generate the actual `README.md` file download link?
* Convert this into a professional portfolio page for your GitHub Pages?
* Auto-generate a video preview or animated walkthrough?

Let me know!
