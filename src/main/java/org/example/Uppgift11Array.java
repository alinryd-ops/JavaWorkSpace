package org.example;

public class Uppgift11Array {


            record Book(String title, String author, int year) {}

            static String beskrivning(Book b) {
                return "Title: " + b.title() + " – Author: " + b.author() + " – Given: " + b.year();
            }

            static void main() {
                Book b1 = new Book("Sagan om ringen", "J.R.R. Tolkien", 1954);
                Book b2 = new Book("Harry Potter", "J.K. Rowling", 1997);
                Book b3 = new Book("1984", "George Orwell", 1949);

                IO.println(beskrivning(b1));
                IO.println(beskrivning(b2));
                IO.println(beskrivning(b3));
            }
        }


