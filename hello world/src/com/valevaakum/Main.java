package com.valevaakum;

import java.awt.*;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // esimene pool
        /*
        int age = 37;
        int temperature = 20;
        age = 35;
        System.out.println(age);

        int myAge = 30;
        int herAge = myAge;
        System.out.println(herAge);

        //byte, short, int, long täisarvudeks;
        //float, double komakohtadega;
        //char, boolean;

        byte age2 = 30;
        long viewsCount = 3_123_456_789L;
        float price = 10.99F;
        char letter = 'A';
        boolean isEligible = true;

        byte age3 = 30;
        Date now = new Date();
        System.out.println(now);

        byte x = 1;
        byte y = x;
        x = 2;
        System.out.println(y);

        Point point1 = new Point(1,1);
        Point point2 = point1;
        point1.x = 2;
        System.out.println(point2);
        ;
        String message = new String("hello world");
        String message2 = "Hello World" + "!!";
        System.out.println(message2.replace("!", "?"));

        String message3 = "hello \"mosh\", c:\\Windows\\...";
        System.out.println(message3);

        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 3;
        numbers[4] = 5;
        System.out.println(Arrays.toString(numbers));

        int[][] array = new int[2][3];
        array[0][0] = 1;
        System.out.println(Arrays.deepToString(array));

        final byte AGE4 = 37;
        final float PI = 3.14F;

        double result = (double) 10 / (double) 3;
        System.out.println(result);

        int i = 1;
        i++;
        ++i;
        i = i + 2;
        i += 2;
        System.out.println(i);

        short o = 1;
        int p = o + 2;
        System.out.println(p);

        double a = 1.1;
        int s = (int) a + 2;
        System.out.println(s);

        String d = "1";
        int f = Integer.parseInt(d) + 3;
        System.out.println(f);

        int result2 = Math.round(1.1F);
        int result3 = (int) (Math.random() * 100);
        System.out.println(result3);

        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result4 = currency.format(1234567.891);
        System.out.println(result4);

        String result5 = NumberFormat.getPercentInstance().format(0.1);
        System.out.println(result5);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Vanus: ");
        byte age4 = scanner.nextByte();
        System.out.println("Sa oled " + age4 + " aastane.");

        Scanner nimiSisend = new Scanner(System.in);
        System.out.print("Nimi: ");
        String nimi = nimiSisend.nextLine().trim();
        System.out.println("Sinu nimi on " + nimi);
        */

        //morgage calculator

        final byte PROTSENT = 100;
        final byte KUUD_AASTAS = 12;
        Scanner scanner = new Scanner(System.in);

        int laenuSumma = 0;
        int laenuSummaMin = 1000;
        int laenuSummaMax = 1000000;
        while (true) {
            System.out.print("Laenu summa: ");
            laenuSumma = scanner.nextInt();
            if (laenuSumma <= laenuSummaMin || laenuSumma >= laenuSummaMax) {
                System.out.println("Laenu saab " + laenuSummaMin + " kuni " + laenuSummaMax);
            } else
                break;
        }

        float intress = 0;
        int intressMin = 0;
        int intressMax = 30;
        while (true) {
            System.out.print("Intress: ");
            intress = scanner.nextFloat();
            if (intress == intressMin || intress > intressMax) {
                System.out.println("Laenu intress on vahemikus " + intressMin + " kuni " + intressMax + "%");
            } else
                break;
        }
        float intressKuudes = intress / PROTSENT / KUUD_AASTAS;

        int perjoodAastates = 0;
        int perjoodMin = 1;
        int perjoodMax = 30;
        while (true) {
            System.out.print("Perjood aastates: ");
            perjoodAastates = scanner.nextInt();
            if (perjoodAastates <= perjoodMin || perjoodAastates > perjoodMax) {
                System.out.println("Laenu saab " + perjoodMin + " kuni " + perjoodMax + " aastaks");
            } else
                break;
        }
        int perjoodKuudes = perjoodAastates * KUUD_AASTAS;

        double kuumakse = laenuSumma *
                ((intressKuudes*Math.pow(1+intressKuudes, perjoodKuudes))
                        /
                (Math.pow(1+intressKuudes, perjoodKuudes)-1));

        String kuumakseEurodes = NumberFormat.getCurrencyInstance().format(kuumakse);

        System.out.println("Kuumakse: " + kuumakseEurodes);


        // teine pool

        /*
        int x = 1;
        int y = 1;
        System.out.println(x != y); // == < <= > >=

        int temperature = 22;
        boolean isWarm = temperature > 20 &&temperature < 40;
        System.out.println(isWarm);

        boolean hasHighIncome = false;
        boolean hasGoodCredit = true;
        boolean hasCriminalRecord = false;
        boolean isEligible = !hasCriminalRecord && (hasHighIncome || hasGoodCredit);
        System.out.println(isEligible);

        temperature = 15;
        if (temperature >= 30)
            System.out.println("Its a hot day \nDrink plenty of water!");
        else if (temperature >= 20 && temperature < 30)
            System.out.println("Its a nice day");
        else
            System.out.println("its cold");

        int income = 120000;
        hasHighIncome = (income > 100000);
        System.out.println(hasHighIncome);

        String className = "Economy";
        if (income > 100000)
            className = "First class";

        className = income > 100000 ? "First" : "Economy";

        String role = "admin";
        if (role == "admin")
            System.out.println("you are a admin");
        else if (role == "moderator")
            System.out.println("you are a moderator");
        else
            System.out.println("you are a guest");

        switch (role) {
            case "admin":
                System.out.println("you are a admin");
                break;
            case "moderator":
                System.out.println("you are a moderator");
                break;
            default:
                System.out.println("you are a guest");
        }
*/
        // FizzBuzz
/*
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number: ");
        int number = scanner.nextInt();

        if (number % 5 == 0 && number % 3 == 0)
            System.out.println("FizzBuzz");
        else if (number % 5 == 0)
            System.out.println("Fizz");
        else if (number % 3 == 0)
            System.out.println("Buzz");
        else
            System.out.println(number);
*/
        // kolmas pool
        /*
        for (int i = 0; i < 5; i++)
            System.out.println("hello world!");

        for (int j = 5; j > 0; j--)
            System.out.println(j);

        System.out.println("-----");
        for (int k = 0; k < 5; k++) {
            System.out.println("|kk" + k + "|");
            System.out.println("-----");
        }

        int i = 5;
        while (i > 0) {
            System.out.println("hello " + i);
            i--;
        }

        String input = "";
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Input: ");
            input = scanner.next().toLowerCase().trim();
            if (input.equals("pass"))
                continue;
            if (input.equals("quit"))
                break;
            System.out.println(input);
        }

        String[] fruits = {"apple", "mango", "orange"};

        for (int l = 0; l < fruits.length; l++)
            System.out.println(fruits[l]);
*/
    }
}
