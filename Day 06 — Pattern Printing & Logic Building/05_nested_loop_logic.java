/*
========================================
05_nested_loop_logic.java
========================================
Nested Loop Logic:

✔ Build logic using nested loops
✔ Important for pattern printing and problem solving
*/

public class nested_loop_logic {

    public static void main(String[] args) {

        int rows = 5;

        // Pattern: Increment numbers in rows
        // 1
        // 2 3
        // 4 5 6
        int num = 1;
        for(int i = 1; i <= 3; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }

        // Check logic: Multiplication table 1-3
        for(int i = 1; i <= 3; i++) {
            for(int j = 1; j <= 3; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }
}