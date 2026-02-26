/*
========================================
01_for_loop.java
========================================
for Loop:

✔ Executes a block of code a known number of times
✔ Syntax:
   for(initialization; condition; update){
       // statements
   }
*/

public class for_loop {

    public static void main(String[] args) {

        // Print numbers from 1 to 5
        for(int i = 1; i <= 5; i++) {
            System.out.println("Number: " + i);
        }

        // Sum of first 5 numbers
        int sum = 0;
        for(int i = 1; i <= 5; i++) {
            sum += i; // sum = sum + i
        }
        System.out.println("Sum: " + sum);
    }
}