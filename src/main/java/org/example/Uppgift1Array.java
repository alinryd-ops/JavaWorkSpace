package org.example;

public class Uppgift1Array {
     static void main(){

         //Uppgift 4
         String result = "";
         while (true) {
             String word = IO.readln("Skriv in ett ord: ");

             if (word.isEmpty() || word.equals(".")) {
                 break;
             }
             if(result.isEmpty()) {
                 result = word;
             }else {
                 result = result + " " + word;
             }

         }

         //Uppgift 7
         int[] numbers = {5, 12, 8, 21, 3};

         int sum = 0;
         int max = numbers[0];
         int min = numbers[0];

         for (int i = 0; i < numbers.length; i++) {
             sum += numbers[i];

             if (numbers[i] > max) {
                 max = numbers[i];
             }
             if (numbers[i] < min) {
                 min = numbers[i];
             }
         }

         IO.println("Summa: " + sum);
         IO.println("Max: " + max);
         IO.println("Min: " + min);
         

         IO.println(result);

         int secret = 69;
         int guesses = 0;
         int guess;

         do {
             guess = Integer.parseInt(IO.readln("Gissa ett tal mellan 1 och 100: "));
             guesses++;
             if (guess > secret) {
                 IO.println("För högt!");
             } else if (guess < secret) {
                 IO.println("För lågt!");
             } else {
                 IO.println("Rätt! Du tog " + guesses + " försök!");
             }
         } while (guess != secret);


         //Uppgift 3
         boolean[] test1 = {true, false, true, false};
         boolean[] test2 = {false, false, false};
         boolean[] test3 = {};

         IO.println(countTrue(test1));   // förväntat: 2
         IO.println(countTrue(test2));   // förväntat: 0
         IO.println(countTrue(test3));   // förväntat: 0


        //Uppgift 1
        for (int i = 1; i <= 16; i++) {
            IO.println(i);
        }

        //Uppgift 2
        int i =  65536;
        while (i > 2) {
            IO.println(i);
            i = i >> 1;
        }


    }

    //Uppgift 3
    static int countTrue(boolean[] values) {
        int count = 0;

        for (int i = 0; i < values.length; i++) {
            if (values[i]) {
                count++;
            }
        }

        return count;
    }
}
