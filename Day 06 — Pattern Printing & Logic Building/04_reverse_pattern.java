/*
========================================
04_reverse_pattern.java
========================================
Reverse Patterns:

✔ Stars or numbers printed in reverse
*/

public class reverse_pattern {

    public static void main(String[] args) {

        // Reverse triangle of stars
        for(int i = 5; i >= 1; i--) {
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Reverse number triangle
        for(int i = 5; i >= 1; i--) {
            for(int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}