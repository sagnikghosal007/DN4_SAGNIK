# Week 3 - Spring Core Maven Exercises

This project contains foundational Spring exercises to demonstrate the core concepts of Spring Framework using XML-based configuration and Maven.

## 📁 Exercises Covered

### ✅ Exercise 1: Configuring a Basic Spring Application

**Goal:** Set up a basic Spring application with bean definitions and XML configuration.

#### 📄 Files Involved:
- `applicationContext.xml`
- `BookService.java`
- `BookRepository.java`
- `Main.java`

#### 🧠 Concepts:
- Spring Container
- Bean configuration using XML
- Inversion of Control (IoC)

#### ✅ Expected Output:

BookService: Calling BookRepository...
Fetching list of books from repository...


---

### ✅ Exercise 2: Implementing Dependency Injection

**Goal:** Demonstrate Setter-based Dependency Injection using XML.

#### 📄 Changes:
- Modified `applicationContext.xml` to inject `BookRepository` into `BookService`
- Added `setBookRepository()` method in `BookService`

#### 🧠 Concepts:
- Dependency Injection (DI)
- Setter Injection using Spring XML config

#### ✅ Expected Output:

Dependency Injected BookRepository into BookService.
BookService: Calling BookRepository...
Fetching list of books from repository...



---

### ✅ Exercise 4: Creating and Configuring a Maven Project

**Goal:** Set up a Maven project with required Spring dependencies and plugins.

#### 📄 `pom.xml` Includes:
- Spring Context
- Spring AOP (for later exercises)
- Spring WebMVC (optional for REST)

```xml
<dependencies>
  <dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-context</artifactId>
    <version>5.3.36</version>
  </dependency>
  <dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-aop</artifactId>
    <version>5.3.36</version>
  </dependency>
</dependencies>

<build>
  <plugins>
    <plugin>
      <groupId>org.apache.maven.plugins</groupId>
      <artifactId>maven-compiler-plugin</artifactId>
      <version>3.8.1</version>
      <configuration>
        <source>1.8</source>
        <target>1.8</target>
      </configuration>
    </plugin>
  </plugins>
</build>
