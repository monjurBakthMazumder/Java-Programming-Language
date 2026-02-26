/*
========================================
01_method_syntax.java
========================================
Method Syntax:

✔ Methods are reusable blocks of code
✔ Syntax:
   returnType methodName(parameters){
       // statements
       return value; // if returnType is not void
   }
*/

public class method_syntax {

    // Void method (no return)
    static void greet() {
        System.out.println("Hello! Welcome to Java Methods.");
    }

    public static void main(String[] args) {

        // Calling the method
        greet();
    }
}