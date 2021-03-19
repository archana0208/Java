package javabasics;
import java.util.Scanner;

public class SumProductOfInputIntegers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int input1 = input.nextInt();
        System.out.println("Enter first number : ");
        int input2 = input.nextInt();

        int sum = input1 + input2;
        int product = input1 * input2;

        System.out.println("Sum = " + sum);
        System.out.println("Product = "+ product);


    }
}
