/*
========================================
01_type_casting.java
========================================
Type Casting in Java:

✔ Converting one data type to another.
✔ Two types: Implicit & Explicit
*/

public class type_casting {

    public static void main(String[] args) {

        // Implicit Casting (Widening)
        // Smaller type to larger type (byte → int → long → float → double)
        int a = 100;
        double b = a; // automatic conversion
        System.out.println("Implicit Casting (int to double): " + b);

        // Explicit Casting (Narrowing)
        // Larger type to smaller type (double → int → byte)
        double x = 9.78;
        int y = (int)x; // manual conversion
        System.out.println("Explicit Casting (double to int): " + y);
    }
}