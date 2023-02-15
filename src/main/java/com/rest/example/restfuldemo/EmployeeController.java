package com.rest.example.restfuldemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> getEmployees() {
        return employeeService.getEmployees();
    }

    @GetMapping("/employees/{id}")
    public Employee retrieveEmployee(@PathVariable int id) {
        Employee employee = employeeService.getEmployeeById(id);
        if(employee == null) {
            throw new ResourceNotFoundException("id-" +id);
        }
        return employee;
    }

    @PostMapping("/employees")
    public ResponseEntity<Object> createEmployee(@RequestBody Employee employee) {
        Employee savedEmployee = employeeService.addEmployee(employee);

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(savedEmployee.getId()).toUri();
        return ResponseEntity.created(location).build();
    }

    @PutMapping("/employees/{id}")
    public ResponseEntity<Object> updateEmployee(@RequestBody Employee employee,
                                                 @PathVariable int id) {
        Employee updatedEmployee = employeeService.updateEmployee(employee, id);

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(updatedEmployee.getId()).toUri();
        return ResponseEntity.created(location).build();
    }

    @DeleteMapping("/employees/{id}")
    public void deleteUser(@PathVariable int id) {
        Employee employee = employeeService.deleteEmployeeById(id);
        if(employee == null) {
            throw new ResourceNotFoundException("id-" +id);
        }
    }
}
