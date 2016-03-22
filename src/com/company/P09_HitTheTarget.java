package com.company;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Admin on 22.3.2016 г..
 */
public class P09_HitTheTarget {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int x1 = 0;
        int x2 = 0;
        String validPairs = "";
        ArrayList<String> outLines = new ArrayList<String>();

        for (int i = 1; i <= 20 ; i++) {
            x1 = i;
            for (int j = 1; j <= 20; j++) {
                x2 = j;

                if(x1 + x2 == y){
                    //validPairs = validPairs + x1 + " + " + x2 + " = " + (x1 + x2) + "\n";
                    validPairs = x1 + " + " + x2 + " = " + (x1 + x2);
                    outLines.add(validPairs);
                }else if(x1 - x2 == y){
                    //validPairs = validPairs + x1 + " - " + x2 + " = " + (x1 - x2) + "\n";
                    validPairs = x1 + " - " + x2 + " = " + (x1 - x2);
                    outLines.add(validPairs);
                }

            }

        }
        //System.out.printf(validPairs);
        for (String out : outLines) {
            System.out.println(out);
        }

    }
}
