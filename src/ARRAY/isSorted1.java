package ARRAY;

import java.util.Scanner;

public class isSorted1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        if(check_sorted(arr)){
            System.out.println("Sorted Array");
        }
        else{
            System.out.println("Not a Sorted Array");
        }
    }

    public  static  boolean check_sorted(int[] arr){
        int n = arr.length;
        if(arr[0]<=arr[n-1]){
            for(int i=0;i<n-1;i++){
                if(arr[i]>arr[i+1]){
                    return false;
                }
            }
        }
        else{
            for(int i=0;i<n-1;i++){
                if(arr[i]<arr[i+1]){
                    return false;
                }
            }
        }
        return true;
    }
}
