package com.company;

import java.util.Scanner;

/**
 * Created by Admin on 19.3.2016 г..
 */
public class P01_RectangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        String inLine = input.nextLine();
//        String[] inLineSplitted = inLine.split(" ");
//
//        int a = Integer.parseInt(inLineSplitted[0]);
//        int b = Integer.parseInt(inLineSplitted[1]);
//        int area = a * b;
//
//        System.out.println(area);
        int a = input.nextInt();
        int b = input.nextInt();
        int area = a * b;

        System.out.println(area);

    }
}
