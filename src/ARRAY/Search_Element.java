package ARRAY;

import java.util.Scanner;

public class Search_Element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target: ");
        int target = sc.nextInt();
        int ans=-1,i=0;
        while(i<n){
            if(arr[i]==target){
                ans = arr[i];
            }
            i++;
        }
        System.out.println("Target found at index: "+ ans);

    }
}
