package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the radius of a sphere to find the surface area and volume:");
        double radius = input.nextInt();
        while (radius <= 0) {
            System.out.println("Please enter a radius greater than 0 of a sphere to find the surface area and volume: ");
            radius = input.nextInt();
        }
        System.out.println("The Surface Area is " + surfaceArea(radius));
        System.out.println("The Volume is " + volume(radius));

        System.out.println("7 Random Numbers Generated with the limit of 25: ");
        for (int i = 1; i < 8; i++){
            Random randomNum = new Random();
            int num = randomNum.nextInt(25);
            System.out.println(num);
        }

    }
    public static double surfaceArea(double radius){
        double surfaceArea = (4* Math.PI) * ((Math.pow(radius,3))/3);
        return surfaceArea;
    }
    public static double volume(double radius){
        double volume = (4* Math.PI) * (Math.pow(radius,2));
        return volume;
    }
}