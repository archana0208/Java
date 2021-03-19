package javabasics.conditionalstatements;

import java.util.Scanner;

public class BonusToEmployee {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Salary: ");
        double salary = input.nextDouble();
        System.out.println("Enter Years of Service: ");
        double yearofservice = input.nextDouble();

        if (yearofservice > 5.0) {
            double bonus = (salary * 0.05);
            System.out.println(bonus);
            System.out.println("Net Bonus Ammount = " + bonus);
        } else {
            System.out.println("Not qualified for Bonus");
        }

    }
}

