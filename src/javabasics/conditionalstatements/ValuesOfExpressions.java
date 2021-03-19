package javabasics.conditionalstatements;

public class ValuesOfExpressions {
    public static void main(String[] args) {
        int x = 2;
        int y = 5;
        int z= 0;
        if (x==2)
        {
            System.out.println("x==2 is True");
        }
        if(x!=5)
        {
            System.out.println("x!=5 is True");
        }
        if(x != 5 && y >= 5){
            System.out.println("x != 5 && y >= 5 True");
        }
        if(z != 0 || x == 2){
            System.out.println("z != 0 || x == 2 True");
        }
        if(!(y < 10)){
            System.out.println("!(y < 10) False");
        }

    }

}
