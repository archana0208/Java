package arrays;

import java.util.Scanner;

public class DaysOfWeek {
    public static void main(String[] args)
    {
        String[] days = new String[7];

        days[0]="Monday";
        days[1]="Tuesday";
        days[2]="Wednesday";
        days[3]="Thursday";
        days[4]="Friday";
        days[5]="Saturday";
        days[6]="Sunday";

        System.out.println("Enter no.of the day in the week to be displayed");
        Scanner input = new Scanner(System.in);
        int day = input.nextInt();

        switch(day)
        {
            case 1:
                System.out.println(days[day-1]);
                break;
            case 2:
                System.out.println(days[day-1]);
                break;
            case 3:
                System.out.println(days[day-1]);
                break;
            case 4:
                System.out.println(days[day-1]);
                break;
            case 5:
                System.out.println(days[day-1]);
                break;
            case 6:
                System.out.println(days[day-1]);
                break;
            case 7:
                System.out.println(days[day-1]);
                break;
            default:
                System.out.println("Invalid Input: Enter no. from 1 to 7");
        }


    }
}
