The code provided is written in Java and is a Spring Boot application. It includes a controller class called `DepartmentController` that handles HTTP requests for department-related operations. The code uses Spring annotations such as `@RestController` and `@RequestMapping` to define the endpoints and mapping of requests.

To upgrade the code to be compatible with the latest standards, the following modifications have been made:

`DepartmentController.java`:

```java
package com.example.department.controller;

import com.example.department.entity.Department;
import com.example.department.repository.DepartmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/department")
public class DepartmentController {
    @Autowired
    private DepartmentRepo repo;

    @PostMapping("/submit")
    public ResponseEntity<Department> submit(@RequestBody Department department){
        return ResponseEntity.ok().body(repo.save(department));
    }

    @GetMapping("/dept")
    public ResponseEntity<List<Department>> getAllDepartments() {
        return ResponseEntity.ok().body(repo.findAll());
    }

    @GetMapping("/{did}")
    public ResponseEntity<Department> getById(@PathVariable int did) {
        Optional<Department> department = repo.findById(did);
        if(department.isEmpty()){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(department.get());
    }
}
```

Explanation of Changes:

- Renamed the package name from `com.example.department.Controller` to `com.example.department.controller` to follow Java naming conventions (lowercase package names).
- Renamed the `getalldept` to `getAllDepartments` to use camel case for better readability.
- Renamed the `getbyid` to `getById` to use camel case for better readability.
- Modified the `getById` method to use `Optional` to handle cases where the department with the given ID is not found.
- Updated the `getById` method to return `department.get()` instead of `department` to unwrap the `Optional` object.


The rest of the files and code remain unchanged.