package javabasics.conditionalstatements;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Year");
        int year = input.nextInt();

        if((((year % 4 == 0) && (year % 100)!=0))|| (year % 400 == 0))
        {
            System.out.println("Year " + year + " is a Leap year");
        }
        else{
            System.out.println("Year " + year + " is not a Leap year");
        }
    }
}
