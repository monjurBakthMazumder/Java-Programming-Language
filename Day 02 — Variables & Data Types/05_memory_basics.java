/*
========================================
05_memory_basics.java
========================================
Memory Basics:

✔ Variables are stored in memory.
✔ Each data type has a specific size.
✔ Java handles memory allocation for primitive types.

Memory sizes (approx):
- byte: 1 byte
- short: 2 bytes
- int: 4 bytes
- long: 8 bytes
- float: 4 bytes
- double: 8 bytes
- char: 2 bytes
- boolean: 1 bit (implementation dependent)
*/

public class memory_basics {

    public static void main(String[] args) {

        int a = 10;    // 4 bytes
        double b = 3.14; // 8 bytes
        char c = 'X';  // 2 bytes

        System.out.println("Int a: " + a);
        System.out.println("Double b: " + b);
        System.out.println("Char c: " + c);
    }
}