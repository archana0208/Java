package polymorphism;

public class Degree {
    public static void main(String[] args) {
        Degree degree1 = new Degree();
        degree1.getDegree();

        Undergraduate degree2 = new Undergraduate();
        degree2.getDegree();

        Postgraduate degree3 = new Postgraduate();
        degree3.getDegree();
    }

    public void getDegree() {
        System.out.println("I got a degree");
    }


    static class Undergraduate extends Degree {

        public void getDegree() {
            System.out.println("I am an Undergraduate");
        }
    }

    static class Postgraduate extends Degree {

        public void getDegree() {
            System.out.println("I am a Postgraduate");
        }
    }
}