package com.example.test.java8;

@FunctionalInterface
public interface Shape {
    void shapeCalculation(String shapeValue);
    // String print();
    default void printValue(){ System.out.println("printing");}
}
