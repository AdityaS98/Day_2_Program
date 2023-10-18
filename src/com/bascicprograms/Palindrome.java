package com.bascicprograms;

import java.util.Scanner;

public class Palindrome {
    public static void palindromeCalculator() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int Num = sc.nextInt();
        int c = Num;
        int s = 0;

        while (Num > 0) {
            int r = Num % 10;
            s = (s * 10) + r;
            Num = Num / 10;
        }

        if (c == s) {
            System.out.println("Palindrome Number");
        } else {
            System.out.println("Not a palindrome number");
        }

    }

    public static void main(String[] args) {
        palindromeCalculator();
    }
}
