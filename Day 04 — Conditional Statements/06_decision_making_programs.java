/*
========================================
06_decision_making_programs.java
========================================
Decision Making Programs:

✔ Program that decides output based on conditions
*/

public class decision_making_programs {

    public static void main(String[] args) {

        int age = 18;

        // Check voting eligibility
        if (age >= 18) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligible to vote");
        }

        // Using ternary operator for quick decision
        String eligibility = (age >= 18) ? "Can Vote" : "Cannot Vote";
        System.out.println(eligibility);
    }
}