package ARRAY;

import java.util.Scanner;

public class Print_Subarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter array elements: ");
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        print(a);
        System.out.println();
        //subarray1(a);
        //System.out.println();
        subarray2(a);

    }
    public static void print(int[] arr){
        int n = arr.length;
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
    //Approach 1
    public  static void subarray1(int[] arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                for(int k=i;k<=j;k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
    }
    public  static void subarray2(int[] arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                System.out.print(arr[j]+" ");
            }
            System.out.println();
        }
    }
}
