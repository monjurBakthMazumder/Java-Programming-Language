/*
========================================
06_unary_operators.java
========================================
Unary Operators:

+   Positive
-   Negative
++  Increment
--  Decrement
!   Logical NOT
*/

public class unary_operators {

    public static void main(String[] args) {

        int a = 5;

        System.out.println("Original a: " + a);
        System.out.println("Unary +a: " + (+a));
        System.out.println("Unary -a: " + (-a));
        System.out.println("Post Increment a++: " + (a++));
        System.out.println("After Post Increment: " + a);
        System.out.println("Pre Decrement --a: " + (--a));
    }
}