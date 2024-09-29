# Securi

Securi is a Spring Boot application that provides OAuth2 login functionality using Google and GitHub accounts. After a successful login, users are greeted with a welcome message displaying their username.

## Features

- OAuth2 login with Google and GitHub
- Greeting page displaying the logged-in user's username
- Simple and easy-to-use interface

## Prerequisites

- Java 17 or later
- Maven
- IDE (e.g., IntelliJ IDEA, Eclipse)

## Getting Started

1. **Clone the Repository**

   ```bash
   git clone https://github.com/<your-username>/securi.git
   cd securi
   spring.application.name=securi



# Google OAuth2 Client Configuration
spring.security.oauth2.client.registration.google.client-id=<your-google-client-id>
spring.security.oauth2.client.registration.google.client-secret=<your-google-client-secret>

# GitHub OAuth2 Client Configuration
spring.security.oauth2.client.registration.github.client-id=<your-github-client-id>
spring.security.oauth2.client.registration.github.client-secret=<your-github-client-secret>
spring.security.oauth2.client.registration.github.scope=read:user,user:email
spring.security.oauth2.client.registration.github.redirect-uri={baseUrl}/login/oauth2/code/github
spring.security.oauth2.client.registration.github.authorization-grant-type=authorization_code
spring.security.oauth2.client.registration.github.client-authentication-method=basic

# Run the Project
./mvnw spring-boot:run

# Access the Application

Open your browser and navigate to http://localhost:8080. You will be prompted to log in with your Google or GitHub account


## Output
![LoginPage](https://github.com/manojrajm/SpringBoot_Security_via_Google_Github/blob/master/securi/src/main/java/images/LoginPage.png)

![Google Page](https://github.com/manojrajm/SpringBoot_Security_via_Google_Github/blob/master/securi/src/main/java/images/GoogleLogin.png?raw=true)
![GreetingsPage](https://github.com/manojrajm/SpringBoot_Security_via_Google_Github/blob/master/securi/src/main/java/images/GreetingPage.png)


