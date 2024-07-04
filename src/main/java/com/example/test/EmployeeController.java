package com.example.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/user")
    public String hello()
    {
        return "Hello User!";
    }

    @GetMapping("/employees")
    public List<Employee> getEmployeeList(){
       List<Employee> employees = employeeService.getAllEmployeeList();
       return employees;
    }
    @PostMapping("/employee")
    public Employee addEmployee(@RequestBody Employee employee) throws EmployeeAgeException {
        Employee emp =  employeeService.add(employee);
        return emp;
    }

    @PutMapping("/employee/{id}")
    public Employee updateEmployee(@PathVariable("id") int id, @RequestBody Employee employee) {
        return employeeService.findAndUpdate(id, employee);
    }

    @GetMapping("/{id}")
    public Employee getEmployee(@PathVariable("id") int id){
        Employee emp = employeeService.findEmployee(id);
        return emp;
    }

    @DeleteMapping("/employee/{city}")
    public void deleteEmployee(@PathVariable("city") int id){
        employeeService.deleteEmployee(id);
    }

    @GetMapping("/employee")
    public List<Employee> getEmployeeByCity(@RequestParam("city") String city){
        List<Employee> empList = employeeService.findByCity(city);
        return empList;
    }
}
