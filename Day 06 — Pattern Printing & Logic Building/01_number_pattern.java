/*
========================================
01_number_pattern.java
========================================
Number Patterns:

✔ Print sequences of numbers using loops
✔ Helps in understanding nested loops
*/

public class number_pattern {

    public static void main(String[] args) {

        // Pattern: 1 2 3
        //          1 2 3
        //          1 2 3
        for(int i = 1; i <= 3; i++) {         // rows
            for(int j = 1; j <= 3; j++) {     // columns
                System.out.print(j + " ");
            }
            System.out.println();
        }

        // Pattern: 1
        //          1 2
        //          1 2 3
        for(int i = 1; i <= 3; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}