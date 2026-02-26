/*
========================================
05_break_statement.java
========================================
break Statement:

✔ Exits the current loop immediately
*/

public class break_statement {

    public static void main(String[] args) {

        // Print numbers from 1 to 10, but stop at 5
        for(int i = 1; i <= 10; i++) {
            if(i == 5) {
                System.out.println("Breaking the loop at i = " + i);
                break; // exit loop
            }
            System.out.println("Number: " + i);
        }
    }
}