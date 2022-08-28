package com.mariia.codility.task3;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {

        int g = 0;

        int[] array = {1, 2, 2, 4, 4, 4 ,4};

        Arrays.sort(array);

        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();

        for (int i = 0; i < array.length; i++) {
            if (array[i] == array[i+1]) {
                i++;
            } else if (array[i+1] == array[i+2]) {
                g = array[i];

            }
         }
        System.out.println(g);
     }
}
