package javabasics.loops;

public class Pattern2 {
    public static void main(String[] args) {
        int number = 3;
        int count = number - 1;
        /**for(int k = 1; k<=number; k++)
         {
         for(int i = 1; i<=count; i++)
         System.out.print(" ");
         count--;
         for(int i = 1; i<=2*k-1; i++)
         System.out.print("*");
         System.out.println();
         }**/
        for (int k = count; k > 0; k--) {
            for (int i = count; i > 0; i--)
                System.out.print("");
            count++;
            for (int i = 2 * k - 1; i >=1; i--)
                System.out.print("*");
            System.out.println();
            {
            }
        }
    }
}

