package BASIC_JAVA;

import java.util.Scanner;

public class Digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        int n = ch;
        if((n>=65 && n<=91) || (n>=97 && n<=122)){
            System.out.println("Alphabet");
        }
        else if(n<=9){
            System.out.println("Digit");
        }
        else{
            System.out.println("Invalid");
        }
    }
}
