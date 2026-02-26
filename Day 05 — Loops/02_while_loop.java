/*
========================================
02_while_loop.java
========================================
while Loop:

✔ Executes a block of code while a condition is true
✔ Good for unknown number of iterations
*/

public class while_loop {

    public static void main(String[] args) {

        int i = 1;

        // Print numbers from 1 to 5
        while(i <= 5) {
            System.out.println("Number: " + i);
            i++; // increment to avoid infinite loop
        }

        // Sum of first 5 numbers
        int sum = 0;
        int j = 1;
        while(j <= 5) {
            sum += j;
            j++;
        }
        System.out.println("Sum: " + sum);
    }
}