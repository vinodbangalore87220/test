package com.example.test.java8;

import java.util.Comparator;
import java.util.function.Consumer;

public class Calculate {
    public static void main(String[] args) {
     Shape s1 = ((val)-> System.out.println(val+" calculation Done"));
//        Shape s2 = new Shape() {
//            @Override
//            public void shapeCalculation(String shapeValue) {
//                System.out.println(shapeValue+" calculation Done");
//            }
//        };
        calculate(s1);

    }

    private static void calculate(Shape s1) {
        s1.shapeCalculation("square");
    }
}
