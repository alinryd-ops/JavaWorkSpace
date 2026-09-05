package org.example;

public class Uppgift10 {
    static void main () {

        double celsius = Double.parseDouble(IO.readln("Skriv in en temperatur i Celsius: "));

        double fahrenheit = celsiusToFahrenheit (celsius);

         IO.println(celsius + " grader Ceslius är " + fahrenheit + " grader Fahrenheit!");

        }

        static double celsiusToFahrenheit(double celsius) {
        return celsius * 9.0 / 5.0 + 32;

    }
}
