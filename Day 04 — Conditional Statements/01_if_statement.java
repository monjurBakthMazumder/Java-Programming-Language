/*
========================================
01_if_statement.java
========================================
if Statement:

✔ Executes a block of code only if the condition is true
*/

public class if_statement {

    public static void main(String[] args) {

        int number = 10;

        // Check if number is positive
        if (number > 0) {
            System.out.println(number + " is positive");
        }

        // If condition is false, nothing happens
        if (number < 0) {
            System.out.println(number + " is negative"); // will not execute
        }
    }
}