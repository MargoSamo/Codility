package com.mariia.codility.task5;

public class Solution {
    public static void main(String[] args) {
        int[] A = {0, 1, 0, 1, 1};
        int[] B = {1, 0, 1, 0, 0};
        int counter = 0;

        if (A.length == 0) {
            return;
        }

        for (int i = 0; i < A.length; i=i+2) {
            for (int j = i+1; j < A.length; j++) {
                if (A[i] == A[j]) {
                    continue;
                } else {
                    counter++;
                }
            }
        }
        if (counter > 1000000000) {
            System.out.println(-1);
        }
        System.out.println(counter);
    }
}
