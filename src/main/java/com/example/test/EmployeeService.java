package com.example.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    List<Employee> employeeList = new ArrayList<>();


    public Employee findAndUpdate(int id, Employee employee) {
        Employee emp = employeeRepository.findById(id).get();
        emp.setDepartment(employee.getDepartment());
        emp.setName(employee.getName());
        emp.setCity(employee.getCity());
        return employeeRepository.save(emp);
    }

    public Employee add(Employee emp){
        return employeeRepository.save(emp);
    }

    public Employee findEmployee(int id) {
       return employeeRepository.findById(id).get();
    }

    public List<Employee> getAllEmployeeList() {
            return employeeRepository.findAll();
    }

    public void deleteEmployee(int id){
        employeeRepository.deleteById(id);
    }
}
