/*
========================================
04_constants_final.java
========================================
Constants in Java:

✔ Use 'final' keyword to declare constants.
✔ Cannot be changed after initialization.
*/

public class constants_final {

    public static void main(String[] args) {

        // Declare constant
        final double PI = 3.14159;

        System.out.println("Value of PI: " + PI);

        // PI = 3.14;  // Error! Cannot change a final variable
    }
}