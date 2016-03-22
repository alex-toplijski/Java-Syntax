package com.company;

import java.util.Scanner;

/**
 * Created by Admin on 21.3.2016 г..
 */
public class P05_ConvertDecimalToBase7 {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        int in = input.nextInt();

//        int base = 0;
//        int rem = 0;
//        String out = "";
//
//        for (int i = 0; i < 10; i++) {
//
//            base  = in / 7;
//            rem = in % 7;
//            in = base;
//
//            out = rem + out;
//        }
//        System.out.printf("%d", Integer.parseInt(out));

        System.out.printf("%s", Integer.toString(in, 7));
    }
}
