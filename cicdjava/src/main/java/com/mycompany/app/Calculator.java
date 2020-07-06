package com.mycompany.app;

/**
 * Hello world!
 *
 */
public class Calculator {
    public int add(int a, int b) {
        int rs = a + b;
        return rs;
    }
    public int sub(int a, int b) {
        int rs = a - b;
        return rs;
    }
    public int mul(int a, int b) {
        int rs = a * b;
        return rs;
    }
    public int div(int a, int b) {
        int rs = a / b;
        return rs;
    }
    
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        System.out.println(cal.add(1, 2));
        System.out.println(cal.sub(5, 1));
        System.out.println(cal.mul(4, 10));
        System.out.println(cal.div(6,3));
    }
    
}