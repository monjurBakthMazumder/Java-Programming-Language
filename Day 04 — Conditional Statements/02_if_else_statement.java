/*
========================================
02_if_else_statement.java
========================================
if-else Statement:

✔ Executes one block if condition is true
✔ Executes another block if condition is false
*/

public class if_else_statement {

    public static void main(String[] args) {

        int number = -5;

        if (number >= 0) {
            System.out.println(number + " is non-negative");
        } else {
            System.out.println(number + " is negative");
        }
    }
}