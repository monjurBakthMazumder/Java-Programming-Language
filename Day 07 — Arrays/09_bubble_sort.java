/*
========================================
09_bubble_sort.java
========================================
Bubble Sort (Basic):

✔ Compare adjacent elements and swap if needed
✔ Repeated passes until array is sorted
*/

public class bubble_sort {

    public static void main(String[] args) {

        int[] arr = {50, 20, 40, 10, 30};

        int n = arr.length;
        for(int i = 0; i < n-1; i++) {
            for(int j = 0; j < n-1-i; j++) {
                if(arr[j] > arr[j+1]) {
                    // swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.println("Sorted Array:");
        for(int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}