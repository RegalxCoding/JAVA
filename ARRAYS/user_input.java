package ARRAYS;

import java.util.Scanner;

public class user_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("enter element " + (i + 1) + " :");
            arr[i] = sc.nextInt();
        }
        System.out.println();
        System.out.println("elements of array are:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "\t");
        }
        int temp = 0;
        System.out.println("array elements in ascending order are:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("elements of array are:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "\t");
        }
        System.out.println("array elements in descending order:");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]<arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println();
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+"\t");
        }
        sc.close();
    }
}
