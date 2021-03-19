package javabasics.conditionalstatements;

import java.util.Scanner;

public class StudentWithMedicalCause {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Does Student has Medical Cause Y or N");
        char medicalCause = input.next().charAt(0);

        switch(medicalCause)
        {
            case  'Y':
                System.out.println("Student is allowed to sit in Exam");
                break;

            default:
                System.out.println("Student is not allowed to sit in Exam");

        }
    }
}