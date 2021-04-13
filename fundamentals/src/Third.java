package com.valevaakum;

public class Third {
    public static void main(String[] args) {

        int x = 3;
        int y = 4;

        int mul = x * y;

        System.out.println(mul);

        int div = y / x;

        System.out.println(div);

        int test = 12;

        if ((test % x == 0) && (test % y == 0)) {
            System.out.println("yes both divide 12");
        }

    }
}
