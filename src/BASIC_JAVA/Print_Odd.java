package BASIC_JAVA;

import java.util.Scanner;

public class Print_Odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i= i+2){
            System.out.println(i+" ");
        }
    }
}
