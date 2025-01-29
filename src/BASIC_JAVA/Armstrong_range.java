package BASIC_JAVA;

import java.util.Scanner;

public class Armstrong_range {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<n;i++){
            int numberofdigits = count_digits(i);
            if(check_palindrome(i,numberofdigits)){
                System.out.print(i+" ");
            }
        }
    }
    public static int count_digits(int i){
        int digits =0;
        while(i>0){
            digits++;
            i = i/10;
        }
        return digits;
    }
    public static boolean check_palindrome(int i,int digits){
        int temp = i;
        int num =0;
        while(i>0){
            num= num + (int)Math.pow(i%10,digits);
            i = i/10;
        }
        return num==temp;
    }
}
