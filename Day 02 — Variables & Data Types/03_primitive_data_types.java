/*
========================================
03_primitive_data_types.java
========================================
Java has 8 primitive data types:

1. byte    -> 8-bit integer
2. short   -> 16-bit integer
3. int     -> 32-bit integer
4. long    -> 64-bit integer
5. float   -> 32-bit floating point
6. double  -> 64-bit floating point
7. char    -> single character
8. boolean -> true / false
*/

public class primitive_data_types {

    public static void main(String[] args) {

        // Integer types
        byte b = 10;
        short s = 2000;
        int i = 100000;
        long l = 1000000000L; // L required for long literals

        // Floating point types
        float f = 3.14f;      // f required for float literals
        double d = 3.141592;

        // Character
        char c = 'A';

        // Boolean
        boolean isJavaFun = true;

        System.out.println("Byte: " + b);
        System.out.println("Short: " + s);
        System.out.println("Int: " + i);
        System.out.println("Long: " + l);
        System.out.println("Float: " + f);
        System.out.println("Double: " + d);
        System.out.println("Char: " + c);
        System.out.println("Boolean: " + isJavaFun);
    }
}