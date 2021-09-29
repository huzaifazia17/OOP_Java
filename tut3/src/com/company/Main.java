package com.company;
import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;
import java.text.NumberFormat;

public class Main {

    enum Directions  {North, South, West, East};
    enum Rank {itsNull ,ace, two, three, four,
        five, six, seven, eight, nine, ten, jack, queen, king};

    public static void main(String[] args) {
        // Question 1
        System.out.println("Question 1: ");
        question1();
        System.out.println("");

    }

    //Question 1
    public static void question1(){
        Directions dir1, dir2, dir3, dir4;

        dir2 = Directions.South;
        dir3 = Directions.West;

        System.out.println("The value of Dir2 is " + dir2);
        System.out.println("The ordinal of Dir2 is " + dir2.ordinal());
        System.out.println("The name of Dir2 is " + dir2.name());

        System.out.println("The value of Dir3 is " + dir3);
        System.out.println("The ordinal of Dir3 is " + dir3.ordinal());
        System.out.println("The name of Dir3 is " + dir3.name());
    }
}
