package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Admin on 21.3.2016 г..
 */
public class P07_RandomizeNumbersNtoM {

    public static boolean contains(int[] array, int key) {

        Arrays.sort(array);
        int index = Arrays.binarySearch(array, key);
        //Arrays.sort(array);
        boolean res = (index >= 0);

//        if(index >= 0){
//            return true;
//        }else{
//            return false;
//        }
        return res;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int m = input.nextInt();

        Random rnd = new Random();
        int range = Math.abs(n - m)+1;
        int minRange = Math.min(n, m);

        int currentRandom = 0;
        int out[] = new int[range];
        boolean isGenerated = false;

        for (int i = range; i > 0;) {

            currentRandom = rnd.nextInt(range) + minRange;
            isGenerated = contains(out, currentRandom);

            if(!isGenerated){
                out[i-1] = currentRandom;
                i--;
            }

        }
        //out = out + " " + Integer.toString(currentRandom);
        for (int pr: out) {
            System.out.printf("%d ",pr);
        }
        //System.out.println(Arrays.toString(out));
    }

}

