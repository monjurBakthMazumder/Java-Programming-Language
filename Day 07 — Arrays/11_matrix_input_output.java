/*
========================================
11_matrix_input_output.java
========================================
Matrix Input & Output:

✔ Take input from user and display
*/

import java.util.Scanner;

public class matrix_input_output {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int rows = 2, cols = 3;
        int[][] matrix = new int[rows][cols];

        // Input
        System.out.println("Enter 6 elements for 2x3 matrix:");
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Output
        System.out.println("Matrix:");
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}