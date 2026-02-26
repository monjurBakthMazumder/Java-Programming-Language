/*
========================================
03_parameters_arguments.java
========================================
Parameters & Arguments:

✔ Parameters are variables in method definition
✔ Arguments are actual values passed during call
*/

public class parameters_arguments {

    // Method with parameters
    static void greetPerson(String name, int age) {
        System.out.println("Hello " + name + ", you are " + age + " years old.");
    }

    public static void main(String[] args) {

        // Calling method with arguments
        greetPerson("Alice", 20);
        greetPerson("Bob", 25);
    }
}