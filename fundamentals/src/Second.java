package com.valevaakum;

public class Second {
    public static void main(String[] args) {

        String str = "Yohan";
        int age = 100;

        if(str.equals("Yohan")) {
            System.out.println("yes this is yohan");
        }

        if ((str.equals("Yohan")) && (age > 18)) {
            System.out.println("allow Yohan");
        }

        if ( (str.equals("Yohan")) || (age == 100)) {
            System.out.println("allowed ........");
        }



    }

}
