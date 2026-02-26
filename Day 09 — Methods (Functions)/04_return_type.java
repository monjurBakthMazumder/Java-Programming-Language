/*
========================================
04_return_type.java
========================================
Return Type:

✔ Methods can return values
✔ Use 'return' keyword
*/

public class return_type {

    // Method returns integer
    static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        int sum = add(10, 20);
        System.out.println("Sum: " + sum);

        // Directly print method return
        System.out.println("Sum of 5 + 15: " + add(5, 15));
    }
}