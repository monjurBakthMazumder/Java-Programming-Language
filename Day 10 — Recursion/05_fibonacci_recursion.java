/*
========================================
05_fibonacci_recursion.java
========================================
Fibonacci Series Using Recursion:

✔ F(n) = F(n-1) + F(n-2)
✔ Base Case: F(0)=0, F(1)=1
*/

public class fibonacci_recursion {

    static int fibonacci(int n) {
        if(n == 0) return 0;  // Base Case
        if(n == 1) return 1;  // Base Case
        return fibonacci(n-1) + fibonacci(n-2); // Recursive Case
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.print("Fibonacci Series up to " + n + ": ");
        for(int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println();
    }
}