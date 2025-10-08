package polym;

class Calculator {
    // Method with 2 int parameters
    int add(int a, int b) {
        return a + b;
    }

    // Overloaded method with 3 int parameters
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method with double parameters
    double add(double a, double b) {
        return a + b;
    }
}

public class MethodOverloadingExample {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

System.out.println("Sum of 2 ints: " + calc.add(5, 10));          // Calls first method
System.out.println("Sum of 3 ints: " + calc.add(5, 10, 15));      // Calls second method
System.out.println("Sum of 2 doubles: " + calc.add(5.5, 2.5));    // Calls third method
    }
}

/* What is Method Overloading?

Method Overloading means having multiple methods 
in the same class with the same name but different parameter lists.

It helps achieve compile-time polymorphism.

The difference can be:

Number of parameters

Type of parameters

Order of parameters*/