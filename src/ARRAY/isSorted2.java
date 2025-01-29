package ARRAY;

import java.util.Scanner;

public class isSorted2 {
    static boolean isInc = false;
    static boolean isDec = false;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        if(check_sorted(arr) && isInc){
            System.out.println("Sorted Array in Increasing order");
        }
        else if(check_sorted(arr) && isDec){
            System.out.println("Sorted Array in decreasing order");
        }
        else{
            System.out.println("Unsorted array");
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
            isInc = true;
        }
        else{
            for(int i=0;i<n-1;i++){
                if(arr[i]<arr[i+1]){
                    return false;
                }
            }
            isDec = true;
        }
        return true;
    }
}
