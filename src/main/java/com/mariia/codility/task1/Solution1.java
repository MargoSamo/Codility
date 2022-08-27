package com.mariia.codility.task1;

public class Solution1 {

    public static void main(String[] args) {
        int dano = 3;
        String result = Integer.toBinaryString(dano);
        System.out.println(result);

        char[] num = result.toCharArray();

        int preMax = 0;
        int max = 0;
        int counter = 0;
        boolean isFinishedWithOne = false;

        for(char ch:num) {
            if (ch == '0') {
                counter++;
                if (counter > max) {
                    max = counter;
                }
                isFinishedWithOne = false;
            } else {
                counter = 0;
                preMax = max;
                isFinishedWithOne = true;
            }
        }
        if (!isFinishedWithOne) {
            max = preMax;
        }
        System.out.println(max);
    }
}
