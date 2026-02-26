/*
========================================
Output Methods in Java
========================================
print()
println()
printf()
*/

public class output_methods {

    public static void main(String[] args) {

        // print() -> no new line
        System.out.print("Hello ");
        System.out.print("World");

        System.out.println();

        // println() -> new line added
        System.out.println("Using println");

        // printf() -> formatted output
        System.out.printf("Age: %d\n", 22);
    }
}