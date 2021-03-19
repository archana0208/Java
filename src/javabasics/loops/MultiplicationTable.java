package javabasics.loops;

public class MultiplicationTable {
    public static void main(String[] args) {
        int num1 = 24;
        int num2 = 50;
        int num3 = 29;
        int multipy,i;

        System.out.println("****   Table of " + num1+ "   ****");
        for(i=1; i<=10;i++)
        {
            multipy = num1 * i;

            System.out.println(num1 + " X "+i+" = " + multipy);
        }
        System.out.println("****  Table of " + num2+ "   ****");
        for(i=1; i<=10;i++)
        {
            multipy = num2 * i;

            System.out.println(num2 + " X "+i+" = " + multipy);
        }
        System.out.println("****   Table of " + num3+ "   ****");
        for(i=1; i<=10;i++)
        {
            multipy = num3 * i;

            System.out.println(num3 + " X "+i+" = " + multipy);
        }
    }

}
