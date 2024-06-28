package com.example.test;

public class Employee {
    int id;
    String name;
    String department;
    String city;

    public Employee(int id, String name, String department, String city) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
