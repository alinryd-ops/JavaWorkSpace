package org.example;

public class Uppgift17 {
    static void main() {

        IO.println(operation(15, 9));  // "added"
        IO.println(operation(26, 2));  // "subtracted"
        IO.println(operation(11, 11)); // "none"
    }

    static String operation(int a, int b) {
        if (a + b == 24) return "added";
        if (a - b == 24 || b - a == 24) return "subtracted";
        if (a * b == 24) return "multiplied";
        if (b != 0 && a / b == 24) return "divided";
        if (a != 0 && b / a == 24) return "divided";
        return "none";
    }
}
