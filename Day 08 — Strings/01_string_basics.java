/*
========================================
01_string_basics.java
========================================
String Basics:

✔ String is a sequence of characters
✔ Stored as objects in Java
✔ Immutable (cannot change original value)
*/

public class string_basics {

    public static void main(String[] args) {

        // Declaration
        String str1 = "Hello"; // using double quotes
        String str2 = new String("World"); // using constructor

        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);
    }
}