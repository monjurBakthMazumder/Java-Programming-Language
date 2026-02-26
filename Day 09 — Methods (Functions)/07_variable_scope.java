/*
========================================
07_variable_scope.java
========================================
Variable Scope:

✔ Local variables exist inside method/block
✔ Global/static variables exist for entire class
*/

public class variable_scope {

    static int globalVar = 100; // global/static variable

    static void demoMethod() {
        int localVar = 50; // local variable
        System.out.println("Inside method: localVar = " + localVar);
        System.out.println("Inside method: globalVar = " + globalVar);
    }

    public static void main(String[] args) {

        demoMethod();

        // Cannot access localVar here, will cause error
        // System.out.println(localVar);

        System.out.println("Inside main: globalVar = " + globalVar);
    }
}