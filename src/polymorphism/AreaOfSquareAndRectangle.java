package polymorphism;

public class AreaOfSquareAndRectangle {

    public static void main(String[] args) {
        int length = 15;
        int breadth = 20;


        area(length);
        area(length,breadth);

    }

    public static void area(int side)
    {
        int area = side * side;
        System.out.println("Area of Square is "+area);
    }

    public static void area(int length, int breadth)
    {
        int area = length * breadth;
        System.out.println("Area of Rectangle is  "+area);
    }


}
