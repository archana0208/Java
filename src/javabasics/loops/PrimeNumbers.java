package javabasics.loops;

public class PrimeNumbers {
    public static void main(String[] args) {
        int min = 1;
        int max =100;
        while(min<max)
        {
            boolean flag= false;
            for(int i = 2;i<=min/2;i++)
            {
                if((min%i)==0)
                {
                    flag=true;
                    break;
                }
            }
            if(!flag){
                System.out.println(min +" ");
            }
            min++;
        }
    }
}
