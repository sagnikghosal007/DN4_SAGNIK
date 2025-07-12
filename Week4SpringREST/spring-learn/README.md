### SME for Spring REST hands-on 1 
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
