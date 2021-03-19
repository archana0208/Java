package javabasics.loops;

import java.util.Scanner;

public class AverageOfTenIntegers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int sum = 0;
        for(int i = 1; i<=10; i++) {
            System.out.println("Enter Number");
            int num = input.nextInt();
            sum = sum + num;
        }
        double average = (sum*0.1);
        System.out.println("Average of entered numbers is "+ average);
    }
}