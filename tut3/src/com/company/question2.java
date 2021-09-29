package com.company;

public class question2 {
    enum Rank {itsNull ,ace, two, three, four,
        five, six, seven, eight, nine, ten, jack, queen, king};

    public static void main(String[] args) {
        // Question 2
        System.out.println("Question 2: ");
        Rank();
        System.out.println("");
    }

    // Question 2
    public static void Rank(){
        Main.Rank highCard;
        Main.Rank faceCard;
        Main.Rank card1;
        Main.Rank card2;

        highCard = Main.Rank.ace;
        faceCard = Main.Rank.king;
        card1 = Main.Rank.three;
        card2 = Main.Rank.nine;

        System.out.println("A blackjack hand: " + highCard + " and " + faceCard.name());

        int card1Val = card1.ordinal();
        int card2Val = card2.ordinal();

        System.out.println("A two card hand: " + card1.name() + " and " + card2.name());
        System.out.println("Hand Value: " + (card1Val + card2Val));

    }
}
