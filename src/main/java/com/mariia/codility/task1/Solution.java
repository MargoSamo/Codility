package com.mariia.codility.task1;

public class Solution {

    public static void main(String[] args) {
        int input = 0;
        String result = Integer.toBinaryString(input);
        System.out.println(result);


        int prevMax = 0;
        int max = 0;
        int counter = 0;

        for (char position : result.toCharArray()) {
            int intPosition = Integer.parseInt(String.valueOf(position));
            if (intPosition == 0) {
                counter++;
                if (counter > max) {
                    max = counter;
                }
            } else {
                counter = 0;
                prevMax = max;
            }
        }

        if (counter != 0) {
            max = prevMax;
        }

        System.out.println("Binary gap = " + max);
        // return binaryGap;
    }
}


