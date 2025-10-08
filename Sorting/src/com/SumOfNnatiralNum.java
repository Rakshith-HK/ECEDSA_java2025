package com;

public class SumOfNnatiralNum {

    // Recursive method to calculate sum
    public static int sum(int n) {
        if (n == 1) { // Base case
            return 1;
        }
        return n + sum(n - 1); // Recursive call
    }

    public static void main(String[] args) {
        int n = 5;
        int result = sum(n);
        System.out.println("Sum of first " + n + " natural numbers is: " + result);
    }
}
