package com.interview;

/*
*
* ASSUMPTION: NO JOKERS
Q1
Step 1: Write out the classes for a deck of cards and explain their choices
Step 2: Write out the constructor for the deck
Step 3: Write a shuffle function
Step 4: Write a function that orders the cards in alternating colors but doesn't change the ordering per suit

Q2
Step 1: Find the lowest number between min and max which is all the same digits
Step 2: Write your test cases
Step 3: Find an alternate solution and discuss pros/cons.
*/
public class Main {

    public static void main(String[] args) throws Exception {
        Deck deck = new Deck();
        System.out.println("BEFORE SHUFFLE: ");
        System.out.println(deck.toString());
        deck.shuffle();
        System.out.println("AFTER RANDOM SHUFFLE: ");
        System.out.println(deck.toString());
        deck.alternatingColorShuffle();
        System.out.println("AFTER COLOR SHUFFLE: ");
        System.out.println(deck.toString());
    }
}
