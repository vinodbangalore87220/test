package com.example.test;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TestController {

    List<Employee> employeeList = new ArrayList<>();

    @GetMapping("/user")
    public String hello()
    {
        return "Hello User!";
    }

    @GetMapping("/employees")
    public List<Employee> getEmployeeList(){
       List<Employee> employees = getAllEmployeeList();
       return employees;
    }
    @PostMapping("/employee")
    public List<Employee> addEmployee(@RequestBody Employee employee){
        employeeList.add(employee);
        return employeeList;
    }

    @PutMapping("/employee/{id}")
    public List<Employee> updateEmployee(@PathVariable("id") int id, @RequestBody Employee employee) {
        return findAndUpdate(id, employee);
    }
    @GetMapping("/{id}")
    public Employee getEmployee(@PathVariable("id") int id){
        Employee emp = findEmployee(id);
        return emp;
    }

    private List<Employee> findAndUpdate(int id,Employee employee) {
        for(int i = 0 ; i < employeeList.size() ; i++){
            Employee em = employeeList.get(i);
            if(id == em.getId()){
                em.setName(employee.getName());
                em.setCity(employee.getCity());
                em.setDepartment(employee.getDepartment());

            }
        }
        return employeeList;
    }

    private Employee findEmployee(int id) {
        for(Employee em:employeeList){
            if(id == em.getId()){
                return em;
            }
        }
        return null;
    }

    public List<Employee> getAllEmployeeList() {
        Employee e1 = new Employee(11,"prashant","Banking","Delhi");
        Employee e2 = new Employee(212,"Rohan","ecommerce","Bangalore");
        Employee e3 = new Employee(122,"Rakesh","Banking","Mumbai");
        Employee e4 = new Employee(543,"Amit","computer","Delhi");
        this.employeeList.add(e1);
        this.employeeList.add(e2);
        this.employeeList.add(e3);
        this.employeeList.add(e4);
        return employeeList;
    }

}
