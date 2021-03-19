package javabasics;

public class AdditionToAsciiValue {
    public static void main(String[] args) {
        char c = 'd';
        int asciiValue = (int) c;
        int add = asciiValue + 3;
        char d = (char) add;
        System.out.println(d);
    }
}
