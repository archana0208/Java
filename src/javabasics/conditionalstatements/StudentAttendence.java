package javabasics.conditionalstatements;

import java.util.Scanner;

public class StudentAttendence {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number of Classes Held: ");
        int classesHeld = input.nextInt();
        System.out.println("Enter Number of Classes Attended: ");
        int classesAttended = input.nextInt();

        double percentageClassesAttended = (classesAttended*100)/classesHeld ;

        if(percentageClassesAttended>=75)
        {
            System.out.println("Student is allowed to sit in Exam");
        }
        else{
            System.out.println("Student is not allowed to sit in Exam");
        }
    }
}
