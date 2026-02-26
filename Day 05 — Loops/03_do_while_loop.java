/*
========================================
03_do_while_loop.java
========================================
do-while Loop:

✔ Executes the block at least once, then checks condition
✔ Syntax:
   do{
       // statements
   } while(condition);
*/

public class do_while_loop {

    public static void main(String[] args) {

        int i = 1;

        // Print numbers from 1 to 5
        do {
            System.out.println("Number: " + i);
            i++;
        } while(i <= 5);

        // Example where condition is false initially
        int j = 10;
        do {
            System.out.println("This prints at least once, j = " + j);
        } while(j < 5);
    }
}