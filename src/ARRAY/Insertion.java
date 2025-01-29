package ARRAY;

import java.util.Scanner;

public class Insertion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter array elements: ");
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Enter new value: ");
        int val = sc.nextInt();
        System.out.println("Enter position: ");
        int pos = sc.nextInt();
        print(a);
        System.out.println();
        insert(a,pos,val);
    }
    public static void print(int[] arr){
        int n = arr.length;
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

    public static void insert(int[] arr,int pos,int val){
        int n = arr.length;
        int[] a = new int[n + 1];
        if (pos >= 0) System.arraycopy(arr, 0, a, 0, pos);
        a[pos] = val;
        if (n - pos >= 0) System.arraycopy(arr, pos, a, pos + 1, n - pos);
        print(a);

    }
}
