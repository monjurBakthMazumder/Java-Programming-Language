/*
========================================
03_pyramid_pattern.java
========================================
Pyramid Patterns:

✔ Print stars in a pyramid shape
✔ Learn spacing and nested loops
*/

public class pyramid_pattern {

    public static void main(String[] args) {

        int rows = 4;

        for(int i = 1; i <= rows; i++) {

            // Print spaces
            for(int j = rows; j > i; j--) {
                System.out.print(" ");
            }

            // Print stars
            for(int k = 1; k <= (2*i - 1); k++) {
                System.out.print("*");
            }

            System.out.println();
        }

        /*
        Output:
           *
          ***
         *****
        *******
        */
    }
}