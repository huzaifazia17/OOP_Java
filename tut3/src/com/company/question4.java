package com.company;

import java.util.Scanner;

public class question4 {
    public static void main(String[] args) {
        // Question 4
        System.out.println("Question 4: ");
        question4();
        System.out.println("");
    }
    public static void question4()
    {
        double x1, y1, x2, y2; // coordinates of two points
        double distance; // distance between the points
        Scanner scan = new Scanner(System.in);

        System.out.println ("Enter the coordinates of the first point " +
                "(put a space between them): ");

        x1 = scan.nextDouble();
        y1 = scan.nextDouble();

        System.out.println ("Enter the coordinates of the second point: " +
                " (put a space between them): ");

        x2 = scan.nextDouble();
        y2 = scan.nextDouble();

        double total = Math.sqrt((Math.pow((x1-x2),2)) + (Math.pow((y1-y2),2)));

        System.out.println("The distance between teh two points is " + total);
    }
}
