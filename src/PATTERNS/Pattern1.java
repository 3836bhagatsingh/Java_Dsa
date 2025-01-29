package PATTERNS;

import java.util.Scanner;

public class Pattern1 {
    
    //Function for printing pattern
    public  static  void printPattern(int row,int col){
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col  = sc.nextInt();

        printPattern(row,col);
    }
}
