package com.mariia.codility.task41;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] A = {4, 1, 3};
        int rez = 0;

        Arrays.sort(A);

        if (A.length == 0) {
            return;
        }

        for (int i = 1; i < A.length; i++) {
            if (A[i] == A[i-1]+1) {
                rez = 1;
            } else {
                rez = 0;
                break;
            }


        }
        System.out.println(rez);
    }


}
