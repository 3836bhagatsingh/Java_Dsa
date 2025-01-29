package ARRAY;

import java.util.Scanner;

public class Two_Sum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter array elements: ");
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Enter target: ");
        int target = sc.nextInt();
        int[] arr = find_index(a,target);
        System.out.print("Indexes are "+ arr[0]+" "+arr[1]);

    }
    public static int[] find_index(int[] arr,int target){
        // Array is already sorted
        int n = arr.length;
        int i=0,j = n-1;
        while(i<j){
            if(arr[i]+arr[j]==target){
                return new int[]{i,j};
            }
            if(arr[i]+arr[j]>target){
                j--;
            }
            else{
                i++;
            }
        }
        return new int[]{-1,-1};
    }

}
