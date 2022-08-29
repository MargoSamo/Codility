package com.mariia.codility.task4;

public class Solution {

    public static void main(String[] args) {
        int x = 20;
        int y = 85;
        int d = 30;
        int counter = 0;

        while ( x <= y ) {
            x = x + d;
            counter++;
        }
        System.out.println(counter);
    }
}
