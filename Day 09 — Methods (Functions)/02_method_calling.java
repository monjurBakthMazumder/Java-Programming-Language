/*
========================================
02_method_calling.java
========================================
Method Calling:

✔ Call a method from main() or another method
*/

public class method_calling {

    static void sayHello() {
        System.out.println("Hello!");
    }

    static void sayGoodbye() {
        System.out.println("Goodbye!");
    }

    public static void main(String[] args) {

        // Calling methods
        sayHello();
        sayGoodbye();
    }
}