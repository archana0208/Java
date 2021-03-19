package javabasics.conditionalstatements;

import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Quantity: ");
        int quantity = input.nextInt();
        int costperunit = 100;
        double cost = quantity * costperunit;

        if(cost>1000)
        {
            cost = (cost - (cost * 0.1));
        }

        System.out.println("Total cost for User is " + cost);
    }
}
