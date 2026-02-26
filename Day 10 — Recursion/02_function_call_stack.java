/*
========================================
02_function_call_stack.java
========================================
Function Call Stack Idea:

✔ Each recursive call is pushed onto stack
✔ Last In, First Out (LIFO)
✔ Base case unwinds the stack
*/

public class function_call_stack {

    static void countDown(int n) {
        if(n <= 0) {
            System.out.println("Done!");
            return;
        }
        System.out.println(n);
        countDown(n - 1); // Recursive call
        System.out.println("Returning from n = " + n); // stack unwinds
    }

    public static void main(String[] args) {
        countDown(5);
    }
}