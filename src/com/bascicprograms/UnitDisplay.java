package com.bascicprograms;

import java.util.Scanner;

public class UnitDisplay {
    public static void unitDisplay() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = sc.nextInt();
        int unitPlace = number % 10;
        int tenPlace = (number / 10) % 10;
        int hundredPlace = (number / 100) % 10;

        System.out.println("Unit place: " + unitPlace);
        System.out.println("Ten place: " + tenPlace);
        System.out.println("Hundred place: " + hundredPlace);


    }

    public static void main(String[] args) {

        unitDisplay();
    }
}
