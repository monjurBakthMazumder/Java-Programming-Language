/*
========================================
08_ternary_operator.java
========================================
Ternary Operator:

Syntax:
condition ? value_if_true : value_if_false
*/

public class ternary_operator {

    public static void main(String[] args) {

        int a = 10, b = 20;

        String result = (a > b) ? "a is greater" : "b is greater";
        System.out.println(result);

        int max = (a > b) ? a : b;
        System.out.println("Maximum: " + max);
    }
}