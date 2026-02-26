/*
========================================
03_assignment_operators.java
========================================
Assignment Operators:

=    Assign
+=   Add and assign
-=   Subtract and assign
*=   Multiply and assign
/=   Divide and assign
%=   Modulus and assign
*/

public class assignment_operators {

    public static void main(String[] args) {

        int a = 10;

        a += 5; // a = a + 5
        System.out.println("a += 5: " + a);

        a -= 3; // a = a - 3
        System.out.println("a -= 3: " + a);

        a *= 2; // a = a * 2
        System.out.println("a *= 2: " + a);

        a /= 4; // a = a / 4
        System.out.println("a /= 4: " + a);

        a %= 3; // a = a % 3
        System.out.println("a %= 3: " + a);
    }
}