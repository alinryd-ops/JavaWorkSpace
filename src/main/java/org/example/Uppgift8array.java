package org.example;

public class Uppgift8array {


    record Person(String name, int age, String town) {}

    static void main() {

            Person p1 = new Person ("Erik", 30,"Karlstad");
            Person p2 = new Person("Caroline", 22, "Grums");
            Person p3 = new Person("Fredrik", 76, "Skoghall");

            while (true) {
                String input = IO.readln("Write 1, 2 or 3 to get informaion (or press Enter to end): ");

                if (input.isEmpty()) {
                    break;
                }

                try {
                    int choice = Integer.parseInt(input);

                    switch (choice) {
                        case 1 -> IO.println(p1);
                        case 2 -> IO.println(p2);
                        case 3 -> IO.println(p3);
                        default -> IO.println("Try again, write 1, 2 or 3");
                    }

                } catch(NumberFormatException e) {
                    IO.println("Try again, write 1, 2 or 3!");

                }
            }
        }
    }
