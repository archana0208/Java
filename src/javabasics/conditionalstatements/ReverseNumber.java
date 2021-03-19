package javabasics.conditionalstatements;

import java.util.Scanner;

public class ReverseNumber {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number");
        int num = input.nextInt();
        int rev=0;
        while(num != 0){
            int num1 = num%10;
            rev = (rev *10) + num1;
            num = num/10;
        }
        System.out.println("Reverse of given number is "+ rev);
    }
}
