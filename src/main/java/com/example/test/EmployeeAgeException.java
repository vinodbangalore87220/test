package com.example.test;

public class EmployeeAgeException extends Exception{
    String message;
    EmployeeAgeException(String message){
        this.message = message;
    }
}
