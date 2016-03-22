package com.company;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Admin on 22.3.2016 г..
 */
public class P11_GetFirstOddOrEvenElements {
    public static void main(String[] args) {

        //Scanner variables
        Scanner scLine = new Scanner(System.in);
        int linesCout = 2;
        int curretnInt = 0;
        boolean curretnBool = false;
        String currentString = " ";

        //Main variables
        ArrayList<Integer> numCollection = new ArrayList<Integer>();
        ArrayList<Integer> numSellection = new ArrayList<Integer>();
        int howmanyToGet = 0;
        boolean getOdd = false;
        boolean getEven = false;


        for (int i = 1; i <= linesCout; i++) {
            String line = scLine.nextLine();
            line += " END_LINE";

            //Scanner selection
            Scanner sc = new Scanner(line);
            while (sc.hasNext()) {

                if (sc.hasNextInt()) {
                    curretnInt = sc.nextInt();
                    if( i == 1){
                        numCollection.add(curretnInt);
                    }else if(i == 2){
                        howmanyToGet = curretnInt;
                    }
                    //System.out.println("(int) " + curretnInt);
                } else if (sc.hasNextBoolean()) {
                    curretnBool = sc.nextBoolean();
                    //System.out.println("(boolean) " + curretnBool);
                } else {
                    currentString = sc.next();

                    if(new String("odd").equalsIgnoreCase(currentString)){
                        getOdd = true;
                        getEven = false;
                    }else if (new String("even").equalsIgnoreCase(currentString)){
                        getOdd = false;
                        getEven = true;
                    }
                    //System.out.println("(String) " + currentString);
                }
            }
        }

        boolean isOdd = false;
        boolean isEven = false;

        //Number selection
        for (int i = 0; i < numCollection.size(); i++) {
            if((numCollection.get(i) % 2) == 0){
                isOdd = false;
                isEven = true;
            } else{
                isOdd = true;
                isEven = false;
            }

            if(isOdd == getOdd){
                numSellection.add(numCollection.get(i));
            }else if(isEven == getEven){
                numSellection.add(numCollection.get(i));
            }
        }

        //Print out
        for (int element: numSellection) {
            System.out.printf("%d ", element);
        }
    }
}
