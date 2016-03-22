package com.company;

import java.util.Scanner;

/**
 * Created by Admin on 19.3.2016 г..
 */
public class P02_TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        String inLine = "";
//        String[] inLineSplitted;
//
//        inLine = input.nextLine();
//        inLineSplitted = inLine.split(" ");
//        int Ax = Integer.parseInt(inLineSplitted[0]);
//        int Ay = Integer.parseInt(inLineSplitted[1]);
//
//        inLine = input.nextLine();
//        inLineSplitted = inLine.split(" ");
//        int Bx = Integer.parseInt(inLineSplitted[0]);
//        int By = Integer.parseInt(inLineSplitted[1]);
//
//        inLine = input.nextLine();
//        inLineSplitted = inLine.split(" ");
//        int Cx = Integer.parseInt(inLineSplitted[0]);
//        int Cy = Integer.parseInt(inLineSplitted[1]);

        int Ax = input.nextInt();
        int Ay = input.nextInt();
        int Bx = input.nextInt();
        int By = input.nextInt();
        int Cx = input.nextInt();
        int Cy = input.nextInt();

        int area = (Ax * (By - Cy) + Bx * (Cy - Ay) + Cx * (Ay - By)) / 2;
        area = Math.abs(area);

        System.out.println(area);

    }
}
