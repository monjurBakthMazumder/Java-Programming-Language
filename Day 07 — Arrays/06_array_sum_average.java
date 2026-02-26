/*
========================================
06_array_sum_average.java
========================================
Sum & Average of Array:

✔ Calculate sum and average using loops
*/

public class array_sum_average {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};
        int sum = 0;

        for(int num : arr) {
            sum += num;
        }

        double average = sum / (double)arr.length;

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}