/*
========================================
04_array_input_output.java
========================================
Array Input & Output:

✔ Read input from user
✔ Print array elements
*/

import java.util.Scanner;

public class array_input_output {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        // Input array elements
        System.out.println("Enter 5 numbers:");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Output array elements
        System.out.println("Array elements:");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        sc.close();
    }
}