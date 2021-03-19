package javabasics.loops;

public class AsciiEquivalentCharacters {
    public static void main(String[] args) {
        for (int i=0;i<=255;i++)
        {
            int integer = i;
            char equivalentCharacter = (char) integer;
            System.out.println("ASCII Value of " + i + " is "+ equivalentCharacter );
        }
    }

}
