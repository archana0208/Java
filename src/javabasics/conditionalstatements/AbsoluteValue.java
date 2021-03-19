package javabasics.conditionalstatements;

import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = input.nextInt();
        if(num<0){
            num = (-1)* num;
            System.out.println("Absolute Number is  " + num);
        }else {
            System.out.println("Absolute Number is  " + num);
        }
    }
}