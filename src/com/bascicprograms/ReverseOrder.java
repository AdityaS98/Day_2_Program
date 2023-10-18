package com.bascicprograms;

import java.util.Scanner;

public class ReverseOrder {
    public static void reversedOrderNumber() {
        Scanner sc = new Scanner(System.in);
        int num, rem = 0;

        System.out.println("Enter the number");

        num = sc.nextInt();

        while (num > 0) {
            int digit = num % 10;
            rem = rem * 10 + digit;
            num /= 10;


        }
        System.out.println(rem);

    }

    public static void main(String[] args) {

        reversedOrderNumber();

    }
}
