package javabasics.loops;

public class PrimeFactors {
    public static void main(String[] args) {
        int num = 14;
        boolean flag= false;

        for(int i =2;i<=num;i++ )
        {
            if(num%i==0)
            {
                for(int j=2;j<=i;j++)
                {
                    if(i%j==0)
                    {
                        flag = true;
                        break;
                    }
                }
                if(!flag){
                    System.out.println("Prime Factor is "+ i);
                }
            }
        }

    }
}
