package com.company;

import java.util.Random;

public class question3 {
    public static void main(String[] args) {
        // Question 3
        System.out.println("Question 3: ");
        diceRoll();
        System.out.println("");
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
