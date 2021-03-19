package inheritance;

public class LaptopDetails {
    final String name;
    final String price;
    final String processor;
    final String ram;
    final String hdd;


    public  LaptopDetails(String name, String price, String processor,String ram,String hdd)
    {
        this.name=name;
        this.price=price;
        this.processor=processor;
        this.ram= ram;
        this.hdd=hdd;
    }

    public void printLaptopDetails()
    {
        System.out.println("Name :  " + this.name);
        System.out.println("Price:  " + this.price);
        System.out.println("Processor :  " + this.processor);
        System.out.println("Ram :   " + this.ram);
        System.out.println("HDD :   " + this.hdd + "\n");
    }



}
