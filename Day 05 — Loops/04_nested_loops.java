/*
========================================
04_nested_loops.java
========================================
Nested Loops:

✔ Loop inside another loop
✔ Often used for patterns or 2D structures
*/

public class nested_loops {

    public static void main(String[] args) {

        // Print 5x5 star pattern
        for(int i = 1; i <= 5; i++) {         // outer loop
            for(int j = 1; j <= 5; j++) {     // inner loop
                System.out.print("* ");       // print stars in same line
            }
            System.out.println();              // new line after each row
        }

        // Multiplication Table using nested loops
        for(int i = 1; i <= 3; i++) {
            for(int j = 1; j <= 3; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }
}