package com.mariia.codility.task5;

public class Solution2 {
    public static void main(String[] args) {
        int A = 6;
        int B = 5;
        int K = 2;
        int counter = 0;

        if (A <= B) {
            for (int i = A; i <= B; i++) {
                if ((i % K) == 0 ) {
                    counter++;
                }
            }
            System.out.println(counter);
        } else {
            System.out.println(0);
        }
    }
}
