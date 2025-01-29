package BASIC_JAVA;

import java.util.Scanner;

public class Leap_Year {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%4==0){
            if(n%100==0){
                if(n%400==0){
                    System.out.println("Leap Year");
                }
                else{
                    System.out.println("Not a leap year");
                }
            }
            else {
                System.out.println("Leap year");
            }
        }
        else{
            System.out.println("Not a Leap year");
        }
    }
}
