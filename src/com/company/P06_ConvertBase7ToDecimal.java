package com.company;

import java.util.Scanner;

/**
 * Created by Admin on 21.3.2016 г..
 */
public class P06_ConvertBase7ToDecimal {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        String in = input.nextLine();

//        int resMain = 0;
//        int resRem = 0;
//        int base = 7;
//        String out = "";
//
//        for (int i = 0; i < 10; i++) {
//
//            resMain  = in / base;
//            resRem = in % base;
//            in = resMain;
//
//            out = resRem + out;
//        }
//        System.out.printf("%d", Integer.parseInt(out));

        try{
            Integer inDecimal = Integer.valueOf(in, 7);
            System.out.println(inDecimal);
        }catch(NumberFormatException e ){
            System.out.println("Invalid number!");
        }

        //System.out.printf("%s", Integer.toString(in, 7));
    }

}
