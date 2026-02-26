/*
========================================
05_array_traversal.java
========================================
Array Traversal:

✔ Visit each element using loop
✔ Can use for-each loop
*/

public class array_traversal {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        // Using normal for loop
        System.out.println("Traversal using for loop:");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Using for-each loop
        System.out.println("Traversal using for-each loop:");
        for(int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}