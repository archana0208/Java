package javabasics;

import java.util.Scanner;

public class AreaOfRectangleInIntegerWithDoubleInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number : ");
        double input1 = input.nextDouble();
        System.out.println("Enter first number : ");
        double input2 = input.nextDouble();


        double area = input1 * input2;
        int area1 = (int)area;


        System.out.println("Area of Rectangle in integer with double input is  "+ area1);


    }
}
