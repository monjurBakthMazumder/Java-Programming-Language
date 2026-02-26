/*
========================================
06_recursive_problem_solving.java
========================================
Recursive Problem Solving Examples:

✔ Practice recursion with logic problems
*/

public class recursive_problem_solving {

    // Sum of array using recursion
    static int sumArray(int[] arr, int n) {
        if(n <= 0) return 0;        // Base Case
        return sumArray(arr, n-1) + arr[n-1]; // Recursive Case
    }

    // Reverse a string using recursion
    static String reverseString(String str) {
        if(str.isEmpty()) return ""; // Base Case
        return reverseString(str.substring(1)) + str.charAt(0); // Recursive Case
    }

    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5};
        System.out.println("Sum of array: " + sumArray(numbers, numbers.length));

        String text = "Java";
        System.out.println("Original: " + text);
        System.out.println("Reversed: " + reverseString(text));
    }
}