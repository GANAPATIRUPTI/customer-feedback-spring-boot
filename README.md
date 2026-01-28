
# Customer Feedback Spring Boot Application

A simple Spring Boot web application where users can register, log in, submit feedback, and an admin can view all feedback.  
Built for learning, practice, and interview preparation using MVC architecture.

---

## Tech Stack
Java 21 · Spring Boot · Spring MVC · Spring Data JPA · Thymeleaf · MySQL · Maven · Git/GitHub

---

## Project Structure
```

src/main/java/in/sp/main
├── controller (Admin, Feedback, Login, Register)
├── entity (User, Feedback)
├── repository (UserRepository, FeedbackRepository)
├── service (UserService, UserServiceImpl, FeedbackService, FeedbackServiceImpl)
├── config (SecurityConfig)
└── ZznewProjectApplication.java

src/main/resources
├── templates (login.html, register.html, feedback.html, admin.html)
└── application.properties

```

---

## Features
- User registration & login  
- Submit feedback  
- Admin dashboard to view all feedback  
- MySQL database integration  
- Simple UI with Thymeleaf

---

## How to Run
1. Clone:
```

git clone [https://github.com/GANAPATIRUPTI/customer-feedback-spring-boot.git](https://github.com/GANAPATIRUPTI/customer-feedback-spring-boot.git)

```
2. Open in Eclipse / STS (Existing Maven Project)  
3. Configure DB in `application.properties`:
```

spring.datasource.url=jdbc:mysql://localhost:3306/customer_feedback
spring.datasource.username=root
spring.datasource.password=Root@123
server.port=7890

```
4. Run as **Spring Boot App**

---

## URLs
//Username =user 
//user_Password =c4d2c199-6ca3-4fe5-babd-9184ed0545d3


- Login: `http://localhost:7890/login`  
- Register: `http://localhost:7890/register`  
- Feedback: `http://localhost:7890/feedback`  
- Admin: `http://localhost:7890/admin`

---

## Author
Ganesh Dige

.....

