package com.bascicprograms;

import java.util.Scanner;

public class SumOfNaturalNumbers {
    protected static void sumOfNaturalNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int N = sc.nextInt();


        int sum = 0;
        int i = 1;
        while (i <= N) {
            sum += i;
            i++;
        }


        System.out.println("Sum of first " + N + " natural numbers: " + sum);


    }

    public static void main(String[] args) {
        sumOfNaturalNumber();
    }
}
