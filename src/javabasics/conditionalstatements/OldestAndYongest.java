package javabasics.conditionalstatements;

import java.util.Scanner;

public class OldestAndYongest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Age of First person: ");
        int ageFirstPerson = input.nextInt();
        System.out.println("Enter Age of Second person: ");
        int ageSecondPerson = input.nextInt();
        System.out.println("Enter Age of Third person: ");
        int ageThirdPerson = input.nextInt();

        if (ageFirstPerson > ageSecondPerson) {
            if (ageFirstPerson > ageThirdPerson) {
                System.out.println("Oldest is First Person with age " + ageFirstPerson);
            } else {
                System.out.println("Oldest is Third Person with age " + ageThirdPerson);
            }
        }
        else if(ageSecondPerson > ageThirdPerson)
        {
            System.out.println("Oldest is Second Person with age " + ageSecondPerson);
        }
        else{
            System.out.println("Oldest is Third Person with age " + ageThirdPerson);
        }

        if (ageFirstPerson < ageSecondPerson) {
            if (ageFirstPerson < ageThirdPerson) {
                System.out.println("Youngest is First Person with age " + ageFirstPerson);
            } else {
                System.out.println("Yongest is Third Person with age " + ageThirdPerson);
            }
        }
        else if(ageSecondPerson < ageThirdPerson)
        {
            System.out.println("Yongest is Second Person with age " + ageSecondPerson);
        }
        else{
            System.out.println("Yongest is Third Person with age " + ageThirdPerson);
        }

    }
}


