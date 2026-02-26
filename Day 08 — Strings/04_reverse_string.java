/*
========================================
04_reverse_string.java
========================================
Reverse String:

✔ Reverse string using loop
*/

public class reverse_string {

    public static void main(String[] args) {

        String str = "Hello";
        String reversed = "";

        for(int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        System.out.println("Original: " + str);
        System.out.println("Reversed: " + reversed);
    }
}