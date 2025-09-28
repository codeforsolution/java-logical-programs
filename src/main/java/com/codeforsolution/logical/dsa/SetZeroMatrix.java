package com.codeforsolution.logical.dsa;

public class SetZeroMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,1,1},{1,0,1},{1,1,1}
        };

        setMatrixZeroes(matrix);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void setMatrixZeroes(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        //Arrays to mark rows and columns to be zeroed
        boolean[] zeroRows = new boolean[rows];
        boolean[] zeroCols = new boolean[cols];

        // Traverse the matrix to mark rows and columns to be zeros
        for(int i = 0; i< rows; i++){
            for(int j = 0; j< cols; j++){
               if(matrix[i][j] == 0){
                   zeroRows[i] = true;
                   zeroCols[j] = true;
               }
            }
        }

        //set elements to zero based on the marked rows and cols

        for(int i = 0; i< rows; i++){
            for(int j = 0; j<cols; j++){
                if(zeroRows[i] || zeroCols[j]){
                    matrix[i][j] = 0;
                }
            }
        }

    }
}
