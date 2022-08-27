package com.mariia.codility.task2;

public class Solution {
    public static void main(String[] args) {

        int repeatTimes = 3;
        int[] array = {1, 2, 3, 4, 5, 6, 7};

        for (int i = 0; i < repeatTimes; i++) {
            int lastIndex = array.length - 1;
            int b = array[lastIndex];

            for (int a = lastIndex; a > 0; a--) {
                array[a] = array[a - 1];
            }

            array[0] = b;
        }

        for (int j : array) {
            System.out.print(j + " ");
        }

    }
}
