package com.bascicprograms;

import java.util.Scanner;

public class SumNatural {

    public static void sumOfNaturalNumbers() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range");
        int N = sc.nextInt();
        int sum = 0;
        int i;

        for (i = 0; i <= N; i++) {
            sum += i;

        }

        System.out.println(sum);

    }

    public static void main(String[] args) {
        sumOfNaturalNumbers();
    }
}
