package org.example;

public class Uppgift16 {
    static void main() {

        int totalSlices = Integer.parseInt(IO.readln("Skriv in totalt antal bitar: "));
        int recipients = Integer.parseInt(IO.readln("Skriv in antal mottagare: "));

        int slicesPerPerson = equalSlices(totalSlices, recipients);

        IO.println("Varje person får " + slicesPerPerson + " bitar.");

    }
    public static int equalSlices(int totalSlices, int recipients) {
        return totalSlices / recipients;
    }
}
