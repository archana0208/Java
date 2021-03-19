package javabasics.loops;

import java.util.Scanner;

public class SumOfOddEvenDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();

        int sumOfOddDigits = 0;
        int sumOfEvenDigits = 0;
        while(num>0)
        {
            int rem = (num%10);
            if((rem%2)==0)
            {
                sumOfEvenDigits = sumOfEvenDigits + rem;
            }
            else{
                sumOfOddDigits = sumOfOddDigits + rem;
            }
            num=num/10;
        }
        System.out.println("Sum of Even digits in the number are "+ sumOfEvenDigits);
        System.out.println("Sum of Odd digits in the number are "+ sumOfOddDigits);

    }

}
