package com.company;

import java.util.Scanner;

/**
 * Created by Admin on 22.3.2016 г..
 */
public class P10_CharacterMultiplier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String lineSplitted[] = line.split(" ");

        String str1 = lineSplitted[0];
        String str2 = lineSplitted[1];
        int maxStringLenght = Math.max(str1.length(), str2.length());
        int currentCharStr1 = 0;
        int currentCharStr2 = 0;
        int totalSum = 0;

        for (int i = 0; i < maxStringLenght; i++) {

            try{
                currentCharStr1 = (int) str1.charAt(i);
            } catch(Exception e){
                currentCharStr1 = 1;
            }
            try{
                currentCharStr2 = (int) str2.charAt(i);
            } catch(Exception e){
                currentCharStr2 = 1;
            }

            totalSum = totalSum + (currentCharStr1 * currentCharStr2);

        }
        System.out.println(totalSum);

    }
}
