/*
========================================
05_logical_operators.java
========================================
Logical Operators:

&&   Logical AND
||   Logical OR
!    Logical NOT
*/

public class logical_operators {

    public static void main(String[] args) {

        boolean a = true;
        boolean b = false;

        System.out.println("a && b: " + (a && b)); // AND
        System.out.println("a || b: " + (a || b)); // OR
        System.out.println("!a: " + (!a));         // NOT
    }
}