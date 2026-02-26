/*
========================================
10_2d_arrays.java
========================================
2D Arrays (Matrix):

✔ Array of arrays
✔ Useful for matrices and tables
*/

public class array_2d_arrays {

    public static void main(String[] args) {

        // Declare and initialize 2x3 matrix
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6}
        };

        // Print 2D array
        System.out.println("Matrix:");
        for(int i = 0; i < matrix.length; i++) {         // row
            for(int j = 0; j < matrix[i].length; j++) {  // column
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}