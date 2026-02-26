/*
========================================
04_factorial_recursion.java
========================================
Factorial Using Recursion:

✔ n! = n * (n-1)!
✔ Base case: 0! = 1
*/

public class factorial_recursion {

    static int factorial(int n) {
        if(n == 0) return 1;           // Base Case
        return n * factorial(n - 1);   // Recursive Case
    }

    public static void main(String[] args) {
        int num = 5;
        System.out.println("Factorial of " + num + " is " + factorial(num));
    }
}