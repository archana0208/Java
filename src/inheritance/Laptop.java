package inheritance;

public class Laptop extends LaptopDetails {


        public Laptop(String name,String price,String processor,String ram,String hdd) {
            super (name, price, processor, ram, hdd);
        }


     public static void main(String[] args){
         LaptopDetails laptop1=new LaptopDetails("Lenovo","$1000", "i3", "2GB", "500GB");
         System.out.println("****Laptop1****");
         laptop1.printLaptopDetails();

         LaptopDetails laptop2=new LaptopDetails("Dell","$1500", "i5", "4GB", "1TB");
         System.out.println("****Laptop2****");
         laptop2.printLaptopDetails();

         LaptopDetails laptop3=new LaptopDetails("Sony","$2000", "i9", "8GB", "1TB");
         System.out.println("****Laptop3****");
         laptop3.printLaptopDetails();
     }
}
