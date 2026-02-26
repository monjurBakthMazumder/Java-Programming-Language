/*
========================================
01_recursion_concept.java
========================================
Recursion Concept:

✔ A function that calls itself
✔ Useful for repetitive tasks
✔ Must have a base case to stop recursion
*/

public class recursion_concept {

    static void sayHello(int times) {
        if(times <= 0) return; // Base case
        System.out.println("Hello!");
        sayHello(times - 1);    // Recursive call
    }

    public static void main(String[] args) {
        System.out.println("Print 'Hello' 5 times using recursion:");
        sayHello(5);
    }
}