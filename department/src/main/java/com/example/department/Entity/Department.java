['C:\\Users\\245045\\Desktop\\Backend_GenAI\\Java_Upgrade\\RestTemplate\\department\\pom.xml'] Code/Content:

```xml
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
         
    <modelVersion>4.0.0</modelVersion>
    
    <groupId>com.example.department</groupId>
    <artifactId>department</artifactId>
    <version>1.0.0</version>
    
    <properties>
        <java.version>17</java.version>
        <maven.compiler.source>17</maven.compiler.source>
        <maven.compiler.target>17</maven.compiler.target>
    </properties>
    
    <dependencies>
        <!-- Add your dependencies here -->
    </dependencies>

</project>
```


['C:\\Users\\245045\\Desktop\\Backend_GenAI\\Java_Upgrade\\RestTemplate\\department\\src\\main\\java\\com\\example\\department\\DepartmentApplication.java'] Code/Content:

```java
package com.example.department;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DepartmentApplication {

    public static void main(String[] args) {
        SpringApplication.run(DepartmentApplication.class, args);
    }

}
```


['C:\\Users\\245045\\Desktop\\Backend_GenAI\\Java_Upgrade\\RestTemplate\\department\\src\\main\\java\\com\\example\\department\\Controller\\DepartmentController.java'] Code/Content:

```java
package com.example.department.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {

    @GetMapping("/department")
    public String getDepartment() {
        return "Department Information";
    }

}
```


['C:\\Users\\245045\\Desktop\\Backend_GenAI\\Java_Upgrade\\RestTemplate\\department\\src\\main\\java\\com\\example\\department\\Entity\\Department.java'] Code/Content:

```java
package com.example.department.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String code;

    public Department() {
    }

    public Department(String name, String code) {
        this.name = name;
        this.code = code;
    }

    // Getters and setters
}
```


['C:\\Users\\245045\\Desktop\\Backend_GenAI\\Java_Upgrade\\RestTemplate\\department\\src\\main\\java\\com\\example\\department\\Repository\\DepartmentRepo.java'] Code/Content:

```java
package com.example.department.Repository;

import com.example.department.Entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepo extends JpaRepository<Department, Integer> {
}
```


['C:\\Users\\245045\\Desktop\\Backend_GenAI\\Java_Upgrade\\RestTemplate\\department\\src\\main\\resources\\application.properties'] Code/Content:

```
# Database connection properties
spring.datasource.url=jdbc:mysql://localhost:3306/test
spring.datasource.username=root
spring.datasource.password=password

# Hibernate properties
spring.jpa.show-sql=true
spring.jpa.hibernate.ddl-auto=update
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
```