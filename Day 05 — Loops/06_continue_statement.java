/*
========================================
06_continue_statement.java
========================================
continue Statement:

✔ Skips the current iteration and continues with next
*/

public class continue_statement {

    public static void main(String[] args) {

        // Print numbers 1 to 5, skip 3
        for(int i = 1; i <= 5; i++) {
            if(i == 3) {
                System.out.println("Skipping i = " + i);
                continue; // skip this iteration
            }
            System.out.println("Number: " + i);
        }
    }
}