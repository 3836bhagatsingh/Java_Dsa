package ARRAY;

import java.util.Arrays;
import java.util.Scanner;

public class Min_Max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int[] a = find_min_max(arr);
        System.out.println("Minimum element in array is " + a[0]);
        System.out.println("Maximum element in array is " + a[1]);
    }
    public static int[] find_min_max(int[] arr){
       // Approach 1 --> Sorting
//        Arrays.sort(arr);
//        return new int[]{arr[0],arr[arr.length-1]};

        // Approach 2
        int a = Integer.MAX_VALUE;
        int b = Integer.MIN_VALUE;
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]<a){
                a = arr[i];
            }
            if(arr[i]>b){
                b = arr[i];
            }
        }
        return new int[]{a,b};
    }
}
