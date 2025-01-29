package BASIC_JAVA;

import java.util.Scanner;

public class Fibbonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int first =0;
        int second =1;
        int i =2;
        System.out.print(first+" ");
        System.out.print(second+" ");
        while(i<=n){
            int third = first + second;
            System.out.print(third + " ");
            first = second;
            second = third;
            i++;
        }
    }
}
