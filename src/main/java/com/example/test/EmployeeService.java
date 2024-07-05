package com.example.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;


    public Employee findAndUpdate(int id, Employee employee) {
        Employee emp = employeeRepository.findById(id).get();
        emp.setDepartment(employee.getDepartment());
        emp.setName(employee.getName());
        emp.setCity(employee.getCity());
        return employeeRepository.save(emp);
    }

    public Employee add(Employee emp){
        if(emp.getAge() < 18){
            throw new RuntimeException("Age = "+emp.getAge() +", employee age is less than 18");
        }
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

    public List<Employee> findByCity(String city){
        List<Employee> empList1 =  employeeRepository.findByCities(city);
      //  List<Employee> empList= employeeRepository.findAll();
      //  List<Employee> empList1 = empList.stream().filter(emp -> emp.getCity().equals(city)).collect(Collectors.toList());
        return empList1 ;
    }
}
