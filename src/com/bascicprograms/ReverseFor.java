package com.bascicprograms;

import java.util.Scanner;

public class ReverseFor {
    public static void reversedDigits() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");


        int sum = 0;

        for (int num = sc.nextInt(); num > 0; num = num / 10) {
            int r = num % 10;
            sum = sum * 10 + r;

        }
        System.out.println(sum);

    }

    public static void main(String[] args) {
        reversedDigits();
    }
}
