/*
========================================
02_string_input_output.java
========================================
String Input & Output:

✔ Use Scanner to read strings from user
✔ Print using System.out.println
*/

import java.util.Scanner;

public class string_input_output {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine(); // read full line
        System.out.println("Hello, " + name + "!");

        sc.close();
    }
}