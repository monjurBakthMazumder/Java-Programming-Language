/*
========================================
05_palindrome_check.java
========================================
Palindrome Check:

✔ A string is palindrome if it reads same forward and backward
*/

public class palindrome_check {

    public static void main(String[] args) {

        String str = "madam";
        String reversed = "";

        // Reverse string
        for(int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        // Check equality
        if(str.equals(reversed)) {
            System.out.println(str + " is a palindrome");
        } else {
            System.out.println(str + " is not a palindrome");
        }
    }
}