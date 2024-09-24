package ARRAYS;

import java.util.Scanner;

public class two_d_Array {
    // ARRAY PROGRAM TO PRINT 2D ARRAY
    // ARRAY PROGRAM TO ADD TWO MATRIX
    //
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no. of rows:");
        int row = sc.nextInt();

        System.out.println("enter no. of column:");
        int col = sc.nextInt();

        int[][] arr1 = new int[row][col];
        int[][] arr2 = new int[row][col];
        int[][] arr3 = new int[row][col];

        System.out.println("ENTER ELEMENT OF MATRIX 1:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("enter element  row=>" + (i + 1) + " colume=>" + (j + 1) + ": ");

                arr1[i][j] = sc.nextInt();
            }
        }
        System.out.println("ENTER ELEMENT OF MATRIX 2");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("enter element  row=>" + (i + 1) + " colume=>" + (j + 1) + ": ");
                arr2[i][j] = sc.nextInt();
            }
        }
        // DISPLAYING MATRIX 1
        System.out.println("MATRIX 1:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr1[i][j] + "\t");
            }
            System.out.println();
        }
        // DISPLAYING MATRIX 2
        System.out.println("MATRIX 2:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr2[i][j] + "\t");
            }
            System.out.println();
        }

        // ADDITION OF 2 MATRIX
        // System.out.println("ADDITION OF MATRIX 1 AND 2:");
        // for(int i=0;i<row;i++){
        // for(int j=0;j<col;j++){
        // arr3[i][j]=arr1[i][j]+arr2[i][j];
        // }
        // }
        // for(int i=0;i<row;i++){
        // for(int j=0;j<col;j++){
        // System.out.print(arr3[i][j]+"\t");
        // }
        // System.out.println();
        // }

        // CHECK IF TWO MATRIX ARE EQUAL OR NOT
        
        
        int size=row*col;
        int count=0;
        //if row 0 and col 0 element are equal then count will increment
        for (int i = 0; i < row; i++) {
            
            for (int j = 0; j < col; j++) {
                if (arr1[i][j] == arr2[i][j]) {
                    if (count==size) {
                        System.out.println("equal");
                    }
                    count++;
                } else {
                    System.out.println("ARRAY 1 AND ARRAY 2 ARE NOT EQUAL");
                    break;
                }

            }
        }
        sc.close();
    }
}
