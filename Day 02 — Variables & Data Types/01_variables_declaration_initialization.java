/*
========================================
01_variables_declaration_initialization.java
========================================
Variables in Java:

✔ A variable is a named memory location to store data.
✔ Can store different types: int, float, char, boolean, etc.
✔ Variables must be declared before use.
*/

// Class name should match file name
public class variables_declaration_initialization {

    public static void main(String[] args) {

        // Declaration
        int age;

        // Initialization
        age = 22;

        // Declaration + Initialization in one line
        int year = 2026;

        System.out.println("Age: " + age);
        System.out.println("Year: " + year);
    }
}