package com.mariia.codility.task4new;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        int[] A = {0};
        int X = 5;
        int c = -1;

        if (A.length == 0) {
            return;
        }

        for (int i = 0; i < A.length; i++) {
            if (A[i] == X) {
                c = i;
                break;
            }
        }
        System.out.println(c);
    }
}


