package com.company;

public class Main { //This is the card tester class

    public static void main(String[] args) {

        Card c1 = new Card("Ace", "Spades", 1);
        Card c2 = new Card("3", "Clubs", 3);
        Card c3 = new Card("Ace", "Spades", 1);

        System.out.println(c1.matches(c2));
        System.out.println(c1.matches(c3));

    }
}
