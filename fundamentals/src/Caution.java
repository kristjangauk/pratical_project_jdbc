package com.valevaakum;

public class Caution {
    public static void main(String[] args) {

        int speed = 43;

        if ((speed > 0) && (speed <= 30)) {
            System.out.println("you are ok");
        } else if ((speed > 30) && (speed <= 40)) {
            System.out.println("you are still ok");
        } else if ((speed > 40) && (speed <= 50)) {
            System.out.println("almost");
        } else if (speed > 50) {
            System.out.println("pay the fine!");
        }

        int y = 7;

        if(y==10){
            System.out.println("Value of y is: 10");
        }
        else if(y==7){
            System.out.println("y value is 7");
        }
        else if(y!=10){
            System.out.println("NOT equal to 10!");
        }



    } //x
} //x
