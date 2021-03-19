package javabasics.loops;

import java.util.Scanner;

public class GDCAndLCM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter First number");
        int num1 = input.nextInt();
        System.out.println("Enter Second number");
        int num2 = input.nextInt();
        int gdc = 0;
        int lcm=0;

        for(int i =1; i<=num1;i++)
        {
            if((num1%i) ==0 && (num2%i)==0)
            {
                gdc=i;
                lcm =(num1*num2)/gdc;
            }
        }
        System.out.println("GCD of "+num1+" and "+num2+ " is "+ gdc );
        System.out.println("LCM of "+num1+" and "+num2+ " is "+ lcm );
    }

}
