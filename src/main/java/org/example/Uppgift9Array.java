package org.example;

public class Uppgift9Array {

    static void main() {


        //Uppgift 9
        String sentence = IO.readln("Skriv en mening: ");

        int length = sentence.length();
        String upperCase = sentence.toUpperCase();
        String reversed = new StringBuilder(sentence).reverse().toString();
        boolean containsJava = sentence.contains("Java");

        IO.println("Antal tecken: " + length);
        IO.println("Versaler: " + upperCase);
        IO.println("Baklänges: " + reversed);
        IO.println("Innehåller 'Java': " + containsJava);
    }

}
