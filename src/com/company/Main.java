package com.company;

public class Main {

    public static void main(String[] args) {


//        System.out.println(hasSharedDigit(3244, 4423));
        System.out.println(matchOrNot(2342,65765));

    }

    public static boolean hasSharedDigit(int num1, int num2) {

        if ((num1 < 10 && num1 > 100) || (num2 < 10 && num2 > 100)) {  //Limiting the numbers..
            return false;
        } // Limitations

        int h, rem;

        while (num1 >= 1) {

            h = num1 % 10;
            System.out.println(h + " ----");
            num1 /= 10;
        }

        return true;
    }


    public static int matchOrNot (int num1 , int num2) {

        int rem, rem2;

        while (num2 >= 1) {

            rem = num2 % 10;
            System.out.println(rem + " ++++");
            num2 /= 10;
            return rem;
        }
//
//        if (rem == 0 ){
//            System.out.println("rem");
//        }

        while (num1 >= 1) {

            rem2 = num1 % 10;
            System.out.println(rem2 + " ----");
            num1 /= 10;
            return rem2;
        }

        return -1;
    }

}
