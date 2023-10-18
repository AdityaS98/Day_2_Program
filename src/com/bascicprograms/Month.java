package com.bascicprograms;

import java.util.Scanner;

public class Month {

    public static void monthCalculation() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the dates");
        int m = sc.nextInt();
        int d = sc.nextInt();
        if ((m == 3 && d >= 20) || (m == 4 || m == 5) || (m == 6 && d <= 20)) {

            System.out.println("true");


        } else {
            System.out.println("False");
        }

    }

    public static void main(String[] args) {

    }
}


