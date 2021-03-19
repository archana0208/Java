package polymorphism;

public class Printnumber {
    public static void main(String[] args) {
        int i = 10;
        char ch = 'a';
        boolean flag=true;
        float f = 12.45f;
        double d = 869.7834521;

        System.out.println("***** Data Types *****");
        printNumber(i);
        printNumber(ch);
        printNumber(flag);
        printNumber(f);
        printNumber(d);

    }
    public static void printNumber(int n)
    {
        System.out.println("Integer type: "+n);
    }

    public static void printNumber(char n)
    {
        System.out.println("Character type: "+n);
    }

    public static void printNumber(boolean n)
    {
        System.out.println("Boolean type: "+n);
    }

    public static void printNumber(float n)
    {
        System.out.println("Float type: "+n);
    }

    public static void printNumber(double n)
    {
        System.out.println("Double type: "+n);
    }



}
