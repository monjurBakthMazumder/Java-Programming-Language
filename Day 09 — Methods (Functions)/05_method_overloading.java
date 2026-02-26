/*
========================================
05_method_overloading.java
========================================
Method Overloading:

✔ Same method name with different parameters
✔ Compile-time polymorphism
*/

public class method_overloading {

    // Add two integers
    static int add(int a, int b) {
        return a + b;
    }

    // Add three integers
    static int add(int a, int b, int c) {
        return a + b + c;
    }

    // Add two doubles
    static double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {

        System.out.println("Add 2 integers: " + add(5, 10));
        System.out.println("Add 3 integers: " + add(1, 2, 3));
        System.out.println("Add 2 doubles: " + add(2.5, 3.5));
    }
}