# SME for Spring REST hands-on 1 
## src/main/java
Purpose: Contains the main Java source code.

Structure: Follows package naming com.cognizant.spring_learn.

Main class: SpringLearnApplication.java is the application entry point.

## src/main/resources
Purpose: Contains configuration and static files.

Usage:

application.properties for setting application-level configs (like port, logging, etc.)

Used to define database configs, messages, or Thymeleaf templates if needed.

## src/test/java
Purpose: Used for unit testing with frameworks like JUnit and Mockito.

Note: Initial project may not have tests, but this folder is essential for TDD/BDD practices.

## SpringLearnApplication.java
java
Copy
Edit
@SpringBootApplication
public class SpringLearnApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringLearnApplication.class, args);
        System.out.println("SpringLearnApplication has started successfully.");
    }
}
Contains the main() method that starts the Spring Boot application.

Execution point of the application.

---

## Purpose of @SpringBootApplication
A meta-annotation that includes:

@Configuration – Declares the class as a source of bean definitions.

@EnableAutoConfiguration – Enables auto-configuration based on classpath.

@ComponentScan – Scans current and sub-packages for Spring components.

--- 


## output 
![WhatsApp Image 2025-07-12 at 17 10 16_2f45b145](https://github.com/user-attachments/assets/4eb4851c-1b19-4901-b4fa-2960b228246a)
![WhatsApp Image 2025-07-12 at 16 44 57_f106aa0a](https://github.com/user-attachments/assets/2eed4b94-ef00-41cc-a71f-5258edace58e)
![WhatsApp Image 2025-07-12 at 16 46 17_e598c81f](https://github.com/user-attachments/assets/98941f04-7d82-424d-bc4a-1a650646d36e)
<img width="1000" height="411" alt="image" src="https://github.com/user-attachments/assets/47767e2c-4d87-4494-8054-77a7a219fcca" />
DEBUG com.cognizant.spring_learn.Country -- Inside Country Constructor.
DEBUG com.cognizant.spring_learn.Country -- Inside setCode()
DEBUG com.cognizant.spring_learn.Country -- Inside setName()
DEBUG com.cognizant.spring_learn.SpringLearnApplication -- Country : Country [code=IN, name=India]


---




##  pom.xml – Maven Configuration
xml
Copy
Edit
<dependencies>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-devtools</artifactId>
        <scope>runtime</scope>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-test</artifactId>
        <scope>test</scope>
    </dependency>
</dependencies>
##  Plugin Configuration
xml
Copy
Edit
<build>
    <plugins>
        <plugin>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-maven-plugin</artifactId>
        </plugin>
    </plugins>
</build>


---

## 7. 📊 Dependency Hierarchy (in IntelliJ)

![WhatsApp Image 2025-07-12 at 17 12 19_99ca85e6](https://github.com/user-attachments/assets/a8b5b74c-f5d4-4382-9d75-5abc0578747a)



✅ Summary
Component	Description
- src/main/java	Application source code
- src/main/resources	Configurations like application.properties
- src/test/java	Unit test cases folder
- SpringLearnApplication	Main class to bootstrap the app
- @SpringBootApplication	Meta-annotation for config, scan, and auto-setup
- pom.xml	Maven project configuration file


# SME for Spring REST handson 2

### output (HelloController)

![WhatsApp Image 2025-07-12 at 18 04 07_8ae1698e](https://github.com/user-attachments/assets/1dabaf9e-00c7-46e0-b500-a0f69e90bd01)

![WhatsApp Image 2025-07-12 at 18 08 15_f805dfab](https://github.com/user-attachments/assets/cd056910-cde2-4fda-8a77-33592564b460)

---



## HTTP Headers – Developer Tools vs Postman

This guide explains how to **view HTTP headers** in both the **Network tab of browser developer tools** and **Postman**, with step-by-step SME (Subject Matter Expert) clarity.

---

##  1. Viewing HTTP Headers in Browser Developer Tools (Network Tab)

###  Steps to Follow:

1. Open your web application in **Chrome** (or any modern browser).
2. Right-click anywhere on the page → Click on **"Inspect"** or press `Ctrl + Shift + I`.
3. Navigate to the **"Network"** tab in Developer Tools.
4. Reload the page (`F5` or `Ctrl + R`) to capture network activity.
5. Click on any HTTP request (e.g., `GET`, `POST`, etc.) listed on the left side.
6. In the right pane, click on the **"Headers"** tab.

###  What You'll See:
| Section | Description |
|--------|-------------|
| **General** | Shows method (GET/POST), status code (e.g., 200 OK), remote address, etc. |
| **Request Headers** | Headers sent from browser to server (like `Host`, `User-Agent`, `Accept`, etc.) |
| **Response Headers** | Headers returned from server (like `Content-Type`, `Date`, `Cache-Control`, etc.) |

###  SME Note:
HTTP headers are crucial for controlling caching, authentication, content negotiation, and CORS policies.

---

##  2. Viewing HTTP Headers in Postman

###  Steps to Follow:

1. Open **Postman**.
2. Choose the HTTP method (`GET`, `POST`, etc.).
3. Enter the URL of the endpoint.
4. Click **"Send"**.
5. Once the response is received, go to the **"Headers"** tab under the **Response section**.

###  What You'll See:
| Section | Description |
|--------|-------------|
| **Response Headers** | Headers like `Content-Type`, `Content-Length`, `Server`, `Date`, etc. |
| **Request Headers (Optional)** | Found under the **"Console"** or **"Code"** sections if you want to see what headers were sent. |

###  SME Note:
Inspecting headers in Postman is especially helpful while testing APIs for:
- CORS headers (`Access-Control-Allow-Origin`)
- Auth headers (`Authorization`, `Bearer token`)
- Server-side headers (`X-Powered-By`, `Set-Cookie`)

---

##  Summary Table

| Tool         | Where to Find Headers            | Main Use Cases |
|--------------|----------------------------------|----------------|
| **Browser**  | Dev Tools → Network → Headers    | Debugging web page HTTP requests and responses |
| **Postman**  | Response tab → Headers section   | API testing, debugging server responses |

---

## Country REST API - Spring Boot

### output (CountryController) 

![WhatsApp Image 2025-07-12 at 18 33 57_4f828125](https://github.com/user-attachments/assets/164452f6-a7cc-4c20-9516-4969b4bf5fec)
### get by country code output 
![WhatsApp Image 2025-07-12 at 18 57 52_b12610f3](https://github.com/user-attachments/assets/a217a58b-7ebb-4ac9-a7d3-b79e1bd37069)


## Endpoint: `/country`

Returns a country bean (India) as a JSON object by loading it from an XML config file.

###  How it works:
- Controller loads the `in` bean from `country.xml`
- Bean is returned as a `Country` object
- Spring Boot auto-converts the Java object to JSON via Jackson

###  Tools:
- Test in browser or Postman
- Check HTTP headers using DevTools or Postman headers tab

###  Sample Response:
```json
{
  "code": "IN",
  "name": "India"
}


