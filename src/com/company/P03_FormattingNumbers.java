package com.company;

import java.util.Scanner;

/**
 * Created by Admin on 21.3.2016 г..
 */
public class P03_FormattingNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        float b = input.nextFloat();
        float c = input.nextFloat();

        //String aS = Integer.toString(a);
        String aS1 = String.format("%-10X", a);
        String aS2 = String.format("%10s", Integer.toBinaryString(a)).replace(' ', '0');
        String bS = String.format("%10.2f", b);
        String cS = String.format("%-10.3f", c);
        System.out.printf("|%s|%s|%s|%s|", aS1, aS2, bS, cS);

        //System.out.printf("|%d|%d|%.2f|%.31f|", a, a, b, c);

    }
}
