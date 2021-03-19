package javabasics.conditionalstatements;

import java.util.Scanner;

public class PlaceOfService {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Age");
        int age = input.nextInt();
        System.out.println("Enter Sex M or F");
        char sex = input.next().charAt(0);
        System.out.println("Enter Marital Status Y or N");
        char maritalStatus = input.next().charAt(0);

        if(sex=='F')
        {
            System.out.println("Employee is Female and will work only in Urban areas");
        }else if(age>20 && age<40){
            System.out.println("Employee is Male and can work anywhere");
        }else if(age<60 && age>40){
            System.out.println("Employee is Male and will work only in Urban areas");
        }else{
            System.out.println("Error");
        }
    }
}
