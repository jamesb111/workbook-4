package com.pluralsight;

import java.util.Scanner;

public class BlackJackApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("What is your name: ");
        String player1 = scan.nextLine();
        System.out.print("What is your name: ");
        String player2 = scan.nextLine();

        //create the deck
        Deck deck = new Deck();
        //create the hand
        Hand player1hand = new Hand();
        Hand player2hand = new Hand();

        deck.shuffle();

        // deal 3 cards from the deck and add them to the hand
        for (int i = 0; i < 2; i++) {
            // get a card from the deck
            Card card1 = deck.deal();
            // deal that card to the hand
            player1hand.deal(card1);
        }

        for (int i = 0; i < 2; i++) {
            // get a card from the deck
            Card card2 = deck.deal();
            // deal that card to the hand
            player2hand.deal(card2);
        }


        if(player1hand.getValue() <= 21 && player1hand.getValue() > player2hand.getValue()) {
            System.out.println( player1 + "'s is worth " + player1hand.getValue());
            System.out.println(player2 + "'s is worth " + player2hand.getValue());
            System.out.println(player1 + " wins!!!");
        } else if(player2hand.getValue() <= 21 && player2hand.getValue() > player1hand.getValue()) {
            System.out.println( player1 + "'s is worth " + player1hand.getValue());
            System.out.println(player2 + "'s is worth " + player2hand.getValue());
            System.out.println(player2 + " wins!!!");
        }

        //print out the value of all the cards in the hand
//        System.out.println("This hand is worth " + player1hand.getValue());
//        System.out.println("This hand is worth " + player2hand.getValue());

    }
}
