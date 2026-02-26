/*
========================================
06_passing_array_to_method.java
========================================
Passing Array to Method:

✔ Arrays can be passed as parameters
*/

public class passing_array_to_method {

    // Method to print array elements
    static void printArray(int[] arr) {
        for(int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};
        System.out.print("Array elements: ");
        printArray(numbers);
    }
}