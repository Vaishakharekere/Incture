package com.demo.DAY5;

import java.util.Scanner;

public class DivideByZero {
    static void  divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("cannot Divide By Zero.Please Enter a valid Denominator");
        }
       System.out.println("result: " + (a / b));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numerator:");
        int a = sc.nextInt();
        System.out.println("Enter the denominator:");
        int b = sc.nextInt();
        try {
            divide(a, b);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            System.out.println("Enter the denominator:");
         b = sc.nextInt();
            divide(a, b);
        }
        sc.close(); 
    }
}