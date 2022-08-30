package com.mariia.codility.task4;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
//        int x = 20;
//        int y = 85;
//        int d = 30;
//        int counter = 0;
//        while ( x <= y ) {
//            x = x + d;
//            counter++;
//        }
//        System.out.println(counter);

        /*int counter = 0;
        int c = 0;
        int[] A = {5, 6, 7, 3, 2};

        if(A.length == 0) {
            return;
        }
        Arrays.sort(A);
        for (int j : A) {
            System.out.print(j + " ");
        }
        System.out.println(A.length);
        for (int i = 1; i < A.length; i++) {
            if (A[i] == A[i-1]+1) {
                counter++;
            } else if (A[i] == A[i-1]+2) {
                c = A[i-1]+1;
            }
        }
        System.out.println(c);*/

        int sum = 0;
        int sum2 =0;
        int rez = 0;
        int[] A = {1, 2, 3, 1};
        int min = A[0];

        if(A.length == 0) {
            return;
        }

        for (int j=0; j < A.length-1; j++) {
            sum = 0;
            sum2 = 0;
            rez = 0;

            for (int i = j + 1; i < A.length; i++) {
                sum = sum + A[i];
            }

            for (int i = j; i >= 0; i--) {
                sum2 = sum2 + A[i];
            }

            rez = Math.abs(sum - sum2);

            System.out.println(rez);


            if (min > rez) {
                min = rez;
            }

        }
        System.out.println(min);

    }
}
