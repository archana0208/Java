package javabasics.conditionalstatements;

import java.util.Scanner;

public class PrintGreatestInterger {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = input.nextInt();
        System.out.println("Enter second number: ");
        int num2 = input.nextInt();

        if (num1 >num2) {
            System.out.println("First number "+ num1 + " is greatert than " + num2);
        } else {
            System.out.println("Second number "+ num2 + " is greatert than " + num1);
        }
    }
}
