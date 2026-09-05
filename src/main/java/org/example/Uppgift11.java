package org.example;

public class Uppgift11 {
    static void main () {

        double farenheit = Double.parseDouble(IO.readln("Skriv in en temperatur i Farnheit: "));

        double celsius = farenheitToCelsius(farenheit);

        IO.println(farenheit + " grader Farenheit är " + celsius + " grader Celsius!");

    }

    static double farenheitToCelsius (double farenheit) {
        return (farenheit - 32) * 5.0 / 9.0;


    }
}
