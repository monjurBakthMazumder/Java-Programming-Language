/*
========================================
02_star_pattern.java
========================================
Star Patterns:

✔ Print '*' in different arrangements
✔ Good for practicing nested loops
*/

public class star_pattern {

    public static void main(String[] args) {

        // Square pattern
        for(int i = 1; i <= 4; i++) {
            for(int j = 1; j <= 4; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Right-angled triangle
        for(int i = 1; i <= 4; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}