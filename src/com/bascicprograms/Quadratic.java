package com.bascicprograms;

import java.util.Scanner;

public class Quadratic {

    public static void quadraticCalculation() {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the values of a, b, and c
        System.out.print("Enter the value of a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter the value of b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter the value of c: ");
        double c = scanner.nextDouble();

        // Calculate the discriminant
        double discriminant = b * b - 4 * a * c;

        // Check if roots are real or complex
        if (discriminant > 0) {
            // Roots are real and distinct
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);
        } else if (discriminant == 0) {
            // Roots are real and equal
            double root = -b / (2 * a);
            System.out.println("Root 1: " + root);
            System.out.println("Root 2: " + root);
        } else {
            // Roots are complex
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
            System.out.println("Root 1: " + realPart + " + " + imaginaryPart + "i");
            System.out.println("Root 2: " + realPart + " - " + imaginaryPart + "i");
        }
    }

    public static void main(String[] args) {
        quadraticCalculation();
    }
}

