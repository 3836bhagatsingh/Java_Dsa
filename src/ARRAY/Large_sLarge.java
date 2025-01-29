package ARRAY;

import java.util.Scanner;

public class Large_sLarge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter array elements: ");
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        int[] nums = find(a);
        System.out.print("Largest element is "+ nums[0]);
        System.out.println("Second largest is " + nums[1]);
    }
    public static  int[] find(int[] arr){
        int max_ele = Integer.MIN_VALUE;
        int sec_max = Integer.MIN_VALUE;
        for (int j : arr) {
            if (j > max_ele) {
                sec_max = max_ele;
                max_ele = j;
            }
            if (j > sec_max && j != max_ele) {
                sec_max = j;
            }
        }
        return new int[]{max_ele , sec_max};
    }
}
