package org.example;

public class Uppgift12 {
    static void main () {

        double graderCelsius = Double.parseDouble(IO.readln("Skriv in grader i celsius: "));
        double graderFarenheit = Double.parseDouble(IO.readln("Skriv in grader i Farenheit:  "));

        boolean sammaTemp = isSameTemperature(graderCelsius, graderFarenheit);

        IO.println("Stämmer det överens? " + sammaTemp);

    }

    static boolean isSameTemperature(double celsius, double fahrenheit) {
        double converted = celsius * 9.0 / 5.0 + 32;
        return approxEqual(converted, fahrenheit, 0.8);
    }

    static boolean approxEqual(double a, double b, double eps) {
        return Math.abs(a - b) < eps;
    }
}
