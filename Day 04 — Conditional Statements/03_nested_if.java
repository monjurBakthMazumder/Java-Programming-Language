/*
========================================
03_nested_if.java
========================================
Nested if:

✔ if statements inside another if statement
*/

public class nested_if {

    public static void main(String[] args) {

        int number = 75;

        if (number > 0) {
            System.out.println("Number is positive");

            if (number % 2 == 0) {
                System.out.println("Number is even");
            } else {
                System.out.println("Number is odd");
            }

        } else {
            System.out.println("Number is zero or negative");
        }
    }
}