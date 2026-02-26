/*
========================================
03_array_memory_concept.java
========================================
Array Memory Concept:

✔ Elements stored in contiguous memory
✔ Index starts from 0
✔ Length fixed
*/

public class array_memory_concept {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        System.out.println("Array memory addresses (conceptual):");
        for(int i = 0; i < arr.length; i++) {
            System.out.println("Index " + i + " -> Value: " + arr[i]);
        }
    }
}