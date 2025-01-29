package ARRAY;

import java.util.Scanner;

public class Even_Odd {
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
        divide(a);

    }
    public static void print(int[] arr){
        for(int i: arr){
            System.out.print(i+" ");
        }
    }
    public  static void divide(int[] arr){
        int even_count = 0;
        for(int ele:arr){
            if(ele%2==0) even_count++;
        }
        int nums[] = new int[arr.length];
        int k1 = 0,k2 = even_count;
        for(int i:arr){
            if(i%2==0){
                nums[k1++] = i;
            }
            else{
                nums[k2++] = i;
            }


        }
        print(nums);
    }
}
