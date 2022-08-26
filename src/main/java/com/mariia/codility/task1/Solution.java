package com.mariia.codility.task1;

public class Solution {

    public static void main(String[] args) {
        int input = 151;
        String result = Integer.toBinaryString(input);
        System.out.println(result);

        boolean oneIsFound = false;
        int binaryGap = 0;
        int sequenceBinaryGap = 0;

        for (char position : result.toCharArray()) {
            if (position == '1') {
                if (!oneIsFound) {
                    oneIsFound = true;
                    sequenceBinaryGap = 0;
                } else {
                    if (sequenceBinaryGap > binaryGap) {
                        binaryGap = sequenceBinaryGap;
                    }
                    sequenceBinaryGap = 0;
                }
            } else {
                sequenceBinaryGap += 1;
            }
        }

        System.out.println("Binary gap = " + binaryGap);
        // return binaryGap;
    }
}


