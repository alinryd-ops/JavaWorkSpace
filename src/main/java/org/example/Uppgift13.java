package org.example;

public class Uppgift13 {
    static void main(){

        int tal = Integer.parseInt(IO.readln("Skriv in ett heltal: "));
        boolean dela = kanDelasMedFem(tal);
        IO.println(tal + " är delbart med 5: " + dela);


    }

    static boolean kanDelasMedFem (int number) {
        return number % 5 == 0;
    }
}
