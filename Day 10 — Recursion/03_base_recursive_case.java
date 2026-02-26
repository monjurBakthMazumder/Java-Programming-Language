/*
========================================
03_base_recursive_case.java
========================================
Base Case & Recursive Case:

✔ Base Case: stops recursion
✔ Recursive Case: continues recursion
*/

public class base_recursive_case {

    static int sum(int n) {
        if(n == 0) return 0;      // Base Case
        return n + sum(n - 1);    // Recursive Case
    }

    public static void main(String[] args) {
        int result = sum(5); // 5+4+3+2+1 = 15
        System.out.println("Sum of first 5 numbers: " + result);
    }
}