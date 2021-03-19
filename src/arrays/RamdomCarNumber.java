package arrays;

import java.util.Random;
import java.util.Scanner;

public class RamdomCarNumber {
    public static void main(String[] args) {
        Random randomCarNumber = new Random();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of unique car number to be generated ");
        int num = input.nextInt();
        int[] carNumbers = new int[num];
        int i;

        for (i = 0; i < num; i++) {
            carNumbers[i] = randomCarNumber.nextInt((9999 - 100) + 1) + 10;//all random no. will be of 4 digit.
            System.out.println("MH" + carNumbers[i]);
        }


    }
}

