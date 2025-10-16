package com.demo.cards.service.impl;

public class Solution {

    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }

    public static int maxArea(int[] height) {
        int max = 0;

        for (int i = 0; i < height.length - 1; i++) {
            int currentHeight = 0;
            int steps = 1;
            for (int j = i + 1; j < height.length; j++) {
                currentHeight = Math.min(height[i], height[j]) * steps;
                steps++;

                if (currentHeight > max) {
                    max = currentHeight;
                }
            }
        }
        return max;
    }
}
