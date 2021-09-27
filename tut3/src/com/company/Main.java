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

        // Question 2
        System.out.println("Question 2: ");
        Rank();
        System.out.println("");

        // Question 3
        System.out.println("Question 3: ");
        diceRoll();
        System.out.println("");

        // Question 4
        System.out.println("Question 4: ");
        question4();
        System.out.println("");

        // Question 5
        System.out.println("Question 5: ");
        question5();
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

    // Question 2
    public static void Rank(){
        Rank highCard;
        Rank faceCard;
        Rank card1;
        Rank card2;

        highCard = Rank.ace;
        faceCard = Rank.king;
        card1 = Rank.three;
        card2 = Rank.nine;

        System.out.println("A blackjack hand: ace and " + faceCard.name());

        int card1Val = card1.ordinal();
        int card2Val = card2.ordinal();

        System.out.println("A two card hand: " + card1.name() + " and " + card2.name());
        System.out.println("Hand Value: " + (card1Val + card2Val));

    }
    public static void diceRoll(){
        Random randomInt = new Random();
        int rand1 = randomInt.nextInt(6) + 1;
        int rand2 = randomInt.nextInt(6) + 1;

        System.out.println("You have now Rolled Two Dice!");
        System.out.println("Dice 1 rolled: " + rand1);
        System.out.println("Dice 2 rolled: " + rand2);
        System.out.println("The total is: " + (rand1 + rand2));
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

    public static void question5(){
        final double OUNCES_PER_POUND = 16.0;
        double pricePerPound; // price per pound
        double weightOunces; // weight in ounces
        double weight; // weight in pounds
        double totalPrice; // total price for the item
        Scanner scan = new Scanner(System.in);

        NumberFormat money = NumberFormat.getCurrencyInstance();
        DecimalFormat fmt = new DecimalFormat("0.##");

        System. out. println ("Welcome to the CS Deli! ! \n ");

        System.out.print ("Enter the price per pound of your item: ");
        pricePerPound = scan.nextDouble();

        System.out.print ("Enter the weight (ounces): ");
        weightOunces = scan.nextDouble();

        weight = weightOunces / OUNCES_PER_POUND;
        totalPrice = pricePerPound * weight;

        System.out.println("");
        System.out.println("***** CSDELI *****");
        System.out.println("");
        System.out.println("Unit Price: " + money.format(pricePerPound) + " per pound");
        System.out.println("Weight: " + fmt.format(weight) + " pounds");
        System.out.println("");
        System.out.println("TOTAL: " + money.format(totalPrice));
    }
}
