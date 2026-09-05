package org.example;

public class Uppgift14 {
    static void main() {
        int tal = Integer.parseInt(IO.readln("Skriv in ett heltal: "));
        fizzBuzz(tal);
    }

    static void fizzBuzz(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            IO.println("Fizz Buzz");
        } else if (number % 3 == 0) {
            IO.println("Fizz");
        } else if (number % 5 == 0) {
            IO.println("Buzz");
        }
    }
}