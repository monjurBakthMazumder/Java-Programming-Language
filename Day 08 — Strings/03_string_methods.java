/*
========================================
03_string_methods.java
========================================
String Methods:

✔ length() - returns number of characters
✔ charAt(index) - returns character at index
✔ equals() - checks equality
✔ compareTo() - compares two strings
✔ substring(start, end) - extracts substring
✔ toUpperCase() / toLowerCase()
✔ trim() - removes leading & trailing spaces
*/

public class string_methods {

    public static void main(String[] args) {

        String str = "  Hello Java  ";

        System.out.println("Original: '" + str + "'");
        System.out.println("Length: " + str.length());
        System.out.println("Char at 6: " + str.charAt(6));
        System.out.println("Equals 'Hello Java'? " + str.trim().equals("Hello Java"));
        System.out.println("CompareTo 'Hello World': " + str.compareTo("Hello World"));
        System.out.println("Substring(2,7): '" + str.substring(2,7) + "'");
        System.out.println("To Upper Case: '" + str.toUpperCase() + "'");
        System.out.println("To Lower Case: '" + str.toLowerCase() + "'");
        System.out.println("Trimmed: '" + str.trim() + "'");
    }
}