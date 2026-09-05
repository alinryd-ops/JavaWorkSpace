package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        double numbers1 = Double.parseDouble(IO.readln("Skriv in ett tal mellan 1-20"));
        double numbers2 = Double.parseDouble(IO.readln("Skriv in ett tal igen mellan 1-20"));
        double numbers3 = Double.parseDouble(IO.readln("Skriv in ännu ett tal igen mellan 1-20"));

        //Skapar Array för nummer som blir inmatade
        double [] numbers = {numbers1, numbers2, numbers3};

        //Summan i Array
        double sum = 0;
        for (int i = 0; i < numbers.length; i++)    {
            sum += numbers[i];
        }

        //Medelvärde beräkning
        double medelvarde = sum / numbers.length;
        IO.println("Medelvärde: " + medelvarde);

        //Hitta största via loop
        double storst = numbers[0];

        for (int i = 0; i < numbers.length; i++)    {
            if (numbers[i] > storst) {
                storst = numbers[i];
            }
        }
        IO.println("Störst: " + storst);

    }
}
