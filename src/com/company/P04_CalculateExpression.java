package com.company;

import java.util.Scanner;

/**
 * Created by Admin on 21.3.2016 г..
 */
public class P04_CalculateExpression {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        //F1
        double f1Base = ((Math.pow(a, 2) + Math.pow(b, 2))/(Math.pow(a, 2) - Math.pow(b, 2)));
        double f1Power = (a + b + c)/Math.sqrt(c);
        double f1 = Math.pow(f1Base, f1Power);
        //F2
        double f2Base = (Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 3));
        double f2Power = (a - b);
        double f2 = Math.pow(f2Base, f2Power);
        //Difference
        double avg1 = ((a + b + c) / 3d);
        double avg2 = ((f1 + f2) / 2d);
        double diff = Math.abs(avg1 - avg2);

        System.out.printf("F1 result: %.2f, F2 result: %.2f; Diff: %.2f", f1, f2, diff);
    }
}
