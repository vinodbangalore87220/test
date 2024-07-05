package com.example.test.java8;

import com.example.test.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeList {
    public static void main(String[] args) {
        Employee em1 = new Employee();
        em1.setName("Rohan");
        em1.setCity("delhi");
        em1.setAge(20);
        Employee em2 = new Employee();
        em2.setName("amit");
        em2.setCity("pune");
        em2.setAge(25);
        Employee em3 = new Employee();
        em3.setName("rakesh");
        em3.setCity("delhi");
        em3.setAge(20);
        ArrayList<Employee> empList = new ArrayList<>();
        empList.add(em1);
        empList.add(em2);
        empList.add(em3);

        System.out.println("Before filter");
        System.out.println(empList);
        System.out.println("After filter");

        List<Employee> empDel = empList.stream().filter(val -> val.getCity().equals("delhi")).collect(Collectors.toList());
        System.out.println(empDel);

        List<String> empNameList =  empDel.stream().map(val -> val.getName()).collect(Collectors.toList());
        System.out.println("only employee name ");
        System.out.println(empNameList);
    }
}
