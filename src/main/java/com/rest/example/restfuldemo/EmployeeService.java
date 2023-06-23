package com.rest.example.restfuldemo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

@Service
public class EmployeeService {

    private static List<Employee> employees = new ArrayList<>();

    private static int usersCount = 4;

    static {
        employees.add(new Employee(1,"Eeranna", "Kuruva", "eeranna@gmail.com","Bangalore"));
        employees.add(new Employee(2,"Dena", "Geetha", "eeranna@gmail.com","Bangalore"));
        employees.add(new Employee(3,"Tejas", "Kuruva", "eeranna@gmail.com","Bangalore"));
        employees.add(new Employee(4,"Charith", "Kuruva", "eeranna@gmail.com","Bangalore"));
        employees.add(new Employee(5,"Ranga", "Kuruva", "ranga@gmail.com","Kurnool"));
        employees.add(new Employee(6,"Maha", "Laxmi", "maha@gmail.com","Kurnool"));
        employees.add(new Employee(7,"Charan", "Teja", "charan@gmail.com","Kurnool"));
        employees.add(new Employee(8,"Mounika", "Kuruva", "mounika@gmail.com","Kurnool"));
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public Employee getEmployeeById(int id) {
        Predicate<? super Employee> predicate = employee -> employee.getId().equals(id);
        return employees.stream().filter(predicate).findFirst().orElse(null);
    }

    public Employee addEmployee(Employee employee) {
        if(employee.getId() == null) {
            employee.setId(++usersCount);
        }
        employees.add(employee);
        return employee;
    }

    public Employee updateEmployee(Employee emp, Integer id) {
        Employee employee = getEmployeeById(id);
        employee.setFirstName(emp.getFirstName());
        employee.setLastName(emp.getLastName());
        employee.setEmailId(emp.getEmailId());
        employee.setAddress(emp.getAddress());
        return employee;
    }

    public Employee deleteEmployeeById(int id) {
        Iterator<Employee> iterator = employees.iterator();
        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            if(employee.getId() == id) {
                iterator.remove();
                return employee;
            }
        }
        return null;
    }
}
