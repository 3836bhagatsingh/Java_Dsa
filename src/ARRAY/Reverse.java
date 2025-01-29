package ARRAY;

import java.util.Scanner;

public class Reverse {
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
        reverse(a);
    }
    public static void print(int[] arr){
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    public static void reverse(int[] arr){
        if(arr.length==0){
            System.out.println("Array os empty.");
            return;
        }
        int n = arr.length,i=0,j = arr.length-1;
        while(i<n/2){
            int temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = temp;
            i++;
        }
        print(arr);
    }
}
