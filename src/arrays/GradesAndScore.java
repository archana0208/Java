package arrays;

import java.sql.SQLOutput;
import java.util.Scanner;

public class GradesAndScore {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of Grades");
        int noofGrades = input.nextInt();
        int sum = 0;
        int max = 0;
        int min = 100;

        System.out.println("Enter " + noofGrades + " Score (less tha 100)");
        int[] score = new int[noofGrades];

        for (int i = 0; i < noofGrades; i++) {
            score[i] = input.nextInt();
            sum = score[i] + sum;
            if (score[i] > max) {
                max = score[i];
            }
            if (score[i] < min) {
                min = score[i];
            }
        }
        System.out.println("Average Score is " + (sum / noofGrades));
        System.out.println("Highest Score is " + max);
        System.out.println("Lowest Score is " + min);


    }

}

