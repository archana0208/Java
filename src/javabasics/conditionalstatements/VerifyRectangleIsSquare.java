package javabasics.conditionalstatements;

import java.util.Scanner;

public class VerifyRectangleIsSquare {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter length of Rectangle : ");
        int length = input.nextInt();
        System.out.println("Enter breadth of Rectangle: ");
        int breadth = input.nextInt();

        if (length == breadth) {
            System.out.println("Its a Square");
        } else {
            System.out.println("Its a Rectangle and not a Square");
        }
    }

}
