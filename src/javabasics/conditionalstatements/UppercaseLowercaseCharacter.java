package javabasics.conditionalstatements;

import java.util.Scanner;

public class UppercaseLowercaseCharacter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Character");
        char ch = input.next().charAt(0);
        if((ch>='a')&&(ch<'z')){
            System.out.println("Character " + ch + " is in Lower Case");
        } else if((ch>='A')&&(ch<'Z')){
            System.out.println("Character " + ch + " is in Upper Case");
        }
    }
}
