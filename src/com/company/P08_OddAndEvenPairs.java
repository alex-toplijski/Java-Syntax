package com.company;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * Created by Admin on 21.3.2016 г..
 */
public class P08_OddAndEvenPairs {
    public static void main(String[] args) {
        Scanner scLine = new Scanner(System.in);
        String line = scLine.nextLine();
        line += " END_LINE";

        ArrayList<Integer> inList = new ArrayList<Integer>();

        //String input = " 1 true foo 2 false bar 3 ";
        Scanner sc = new Scanner(line);
        while (sc.hasNext()) {
            if (sc.hasNextInt()) {
                inList.add(sc.nextInt());
                //System.out.println("(int) " + sc.nextInt());
            } else if (sc.hasNextBoolean()) {
                System.out.println("(boolean) " + sc.nextBoolean());
            } else {
                System.out.println(sc.next());
            }
        }

        boolean sizeIsEven = (inList.size() % 2) == 0;
        boolean firstIsEven = false;
        boolean secondIsEven = false;
        int firstNum = 0;
        int secondNum = 0;

        for (int i = 0; i <= inList.size()-1; i=i+2) {
            if(sizeIsEven){
                firstNum  = inList.get(i);
                secondNum = inList.get(i+1);

                firstIsEven = (firstNum % 2) == 0;
                secondIsEven = (secondNum % 2) == 0;
                if(firstIsEven && secondIsEven){
                    System.out.printf("%d, %d -> both are even\n", firstNum, secondNum);
                }else if(!firstIsEven && !secondIsEven){
                    System.out.printf("%d, %d -> both are odd\n", firstNum, secondNum);
                }else{
                    System.out.printf("%d, %d -> different\n", firstNum, secondNum);
                }
            }else{
                System.out.println("Invalid length");
                break;
            }


        }

    }
}
