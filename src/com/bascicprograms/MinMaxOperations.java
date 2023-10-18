package com.bascicprograms;

import java.util.Scanner;

public class MinMaxOperations {

    public static void arthematicOperations() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter tha values");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int p = a + b * c;
        int q = c + a / b;
        int r = a % b + c;
        int s = a * b + c;

        if (p > q && p > r && p > s) {
            System.out.println(p + " p is biggest");
        } else if (q > p && q > r && q > s) {
            System.out.println(q + " q is biggest");
        } else if (r > p && q < r && r > s) {
            System.out.println(r + " r is biggest");
        } else {
            System.out.println(s + " s is biggest");
        }

    }

    public static void main(String[] args) {
        arthematicOperations();

    }
}
