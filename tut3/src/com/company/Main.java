package com.company;
import java.util.Random;
import java.util.Scanner;

public class Main {

    enum Directions  {North, South, West, East};
    enum Rank {itsNull ,ace, two, three, four,
        five, six, seven, eight, nine, ten, jack, queen, king};

    public static void main(String[] args) {
        // Question 1
        System.out.println("Question 1: ");
        question1();

        // Question 2
        System.out.println("Question 2: ");
        Rank();

        // Question 3
        System.out.println("Question 3: ");
        diceRoll();
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
}
