/*
========================================
02_array_declaration_initialization.java
========================================
Array Declaration & Initialization:

1. Declaration
   int[] arr;
   int arr[];

2. Memory Allocation
   arr = new int[5];

3. Initialization
   arr[0] = 10;
   arr[1] = 20;

4. Combined
   int[] arr2 = {1, 2, 3, 4, 5};
*/

public class array_declaration_initialization {

    public static void main(String[] args) {

        // Step 1: Declaration
        int[] arr;

        // Step 2: Memory allocation
        arr = new int[5];

        // Step 3: Initialization
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        // Combined declaration + initialization
        int[] arr2 = {1, 2, 3, 4, 5};

        System.out.println("Array elements:");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}