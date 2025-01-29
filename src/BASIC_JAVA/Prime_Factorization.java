package BASIC_JAVA;

import java.util.Scanner;

public class Prime_Factorization {

    public static boolean check_prime(int n){
        for(int i=2;i<n;i++){
            if(n%i==0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=2;i<=n;i++){
            if(n%i==0 && check_prime(i)){
                System.out.println(i+" ");
            }
        }

    }
}
