package Polymorphism;

class Calculator {
   
    int add(int a, int b) {
        return a + b;
    }

    
    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class CompileTime {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Sum of 10 and 20: " + calc.add(10, 20));       
        System.out.println("Sum of 10, 20, and 30: " + calc.add(10, 20, 30)); 
    }
}
