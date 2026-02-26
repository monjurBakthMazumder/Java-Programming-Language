/*
========================================
02_variable_naming_rules.java
========================================
Variable Naming Rules in Java:

1. Can contain letters, digits, underscore (_), and dollar sign ($)
2. Must start with a letter, underscore, or dollar sign
3. Cannot start with a digit
4. Cannot be a Java reserved keyword
5. Case sensitive
*/

public class variable_naming_rules {

    public static void main(String[] args) {

        int myAge = 22;        // valid
        int _score = 100;      // valid
        int $price = 50;       // valid
        // int 2number = 10;   // invalid: starts with digit
        // int class = 5;      // invalid: 'class' is a keyword

        System.out.println("My Age: " + myAge);
        System.out.println("Score: " + _score);
        System.out.println("Price: " + $price);
    }
}