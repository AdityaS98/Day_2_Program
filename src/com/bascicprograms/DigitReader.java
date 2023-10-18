package com.bascicprograms;

import java.util.Scanner;

public class DigitReader {

    public static void digitReader() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the digit");
        int a = sc.nextInt();

        switch (a) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;

            case 5:
                System.out.println("Five");
                break;


            case 6:
                System.out.println("Six");
                break;


            case 7:
                System.out.println("Seven");
                break;


            case 8:
                System.out.println("Eight");
                break;


            case 9:
                System.out.println("Nine");
                break;

            default:
                System.out.println("Hey I am default case");
                break;

        }
    }

    public static void main(String[] args) {
        digitReader();


    }
}
