package javabasics.loops;

public class ArmstrongNumber {
    public static void main(String[] args) {
        System.out.println("Armstrong Number are : ");
        for (int num = 153; num <500; num++)
        {
            int actualNum =num;
            int sum = 0;

           while(actualNum>0) {
                int rem = (actualNum%10);
                //System.out.println(rem);
                int digitCube =(rem * rem * rem);
                //System.out.println(digitCube);
                sum = sum + digitCube;
              // System.out.println(sum);
                actualNum = actualNum / 10;
                //System.out.println(actualNum);
            }

          if(num== sum) {
                System.out.println(num);
            }
        }
    }
}
