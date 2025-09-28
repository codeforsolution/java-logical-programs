package com.codeforsolution.logical.dsa;

public class ZeroMatricTest {
    public static void main(String[] args) {

        int[][] nums= {{13, 24, 13},{64, 0, 46},{77, 78, 49}};

        int[][] zeroMatrix = getZeroMatrix(nums);

        for(int i = 0; i< zeroMatrix.length; i++) {
            for (int j = 0; j < zeroMatrix[0].length; j++) {
                System.out.print(zeroMatrix[i][j]+" ");
            }
            System.out.println();
        }

    }

    private static int[][] getZeroMatrix(int[][] nums) {
        int rowLength = nums[0].length;
        int colLength = nums[1].length;

        boolean[] rowZero = new boolean[rowLength];
        boolean [] colZero = new boolean[colLength];

        for(int i=0; i<rowLength; i++){
            for(int j =0; j<colLength; j++){
                if(nums[i][j]==0){
                    rowZero[i] = true;
                    colZero[j] = true;
                }
            }
        }

        for(int i = 0; i< rowLength; i++) {
            for (int j = 0; j < colLength; j++) {
                if(rowZero[i] || colZero[j] ){
                    nums[i][j]=0;
                }
            }
        }

        return nums;
    }
}
