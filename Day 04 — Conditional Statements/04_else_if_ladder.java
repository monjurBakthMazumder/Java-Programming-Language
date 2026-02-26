/*
========================================
04_else_if_ladder.java
========================================
else-if Ladder:

✔ Multiple conditions checked sequentially
*/

public class else_if_ladder {

    public static void main(String[] args) {

        int marks = 85;

        if (marks >= 90) {
            System.out.println("Grade: A+");
        } else if (marks >= 75) {
            System.out.println("Grade: A");
        } else if (marks >= 60) {
            System.out.println("Grade: B");
        } else if (marks >= 50) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: F");
        }
    }
}