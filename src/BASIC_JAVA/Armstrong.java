package BASIC_JAVA;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int digits =0;
        while(n>0){
            digits++;
            n = n/10;
        }
        int num = 0;
        n = temp;
        while(n>0){
            num= num + (int)Math.pow(n%10,digits);
            n = n/10;
        }
        if(num==temp){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not an armstrong");
        }

    }
}
