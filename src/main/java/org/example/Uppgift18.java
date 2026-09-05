/*

package org.example;

public class Uppgift18 {
    static void main() {
        int player1 = (int) (Math.random() * 6) + 1;
        int player2 = (int) (Math.random() * 6) + 1;

        IO.println("Spelare 1 slog: " + player1);
        IO.println("Spelare 2 slog: " + player2);
        IO.println(decideWinner(player1, player2));
    }

    static String decideWinner(int s1, int s2) {
        if (s1 > s2) return "Spelare 1 vinner";
        if (s2 > s1) return "Spelare 2 vinner";

        // lika värden
        if (s1 % 2 != 0) return "Spelare 1 vinner (turbonus)";
        return "Spelare 2 vinner (stabilitetsbonus)";
    }
}

 */

// ALTERNATIV 2
package org.example;

public class Uppgift18 {
    static void main() {
        boolean playing = true;

        while (playing) {
            int player1 = (int) (Math.random() * 6) + 1;
            int player2 = (int) (Math.random() * 6) + 1;

            IO.println("Spelare 1 slog: " + player1);
            IO.println("Spelare 2 slog: " + player2);
            IO.println(decideWinner(player1, player2));

            IO.println("Skriv 0 för att avsluta, valfri annan siffra för att fortsätta:");
            String input = IO.readln();
            int choice = Integer.parseInt(input);

            if (choice == 0) {
                playing = false;
                IO.println("Spelet avslutat!");
            }
        }
    }

    static String decideWinner(int s1, int s2) {
        if (s1 > s2) return "Spelare 1 vinner";
        if (s2 > s1) return "Spelare 2 vinner";

        // lika värden
        if (s1 % 2 != 0) return "Spelare 1 vinner (turbonus)";
        return "Spelare 2 vinner (stabilitetsbonus)";
    }
}

