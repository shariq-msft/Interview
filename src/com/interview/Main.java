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
        System.out.println("====================== Q1 =========================");
        Deck deck = new Deck();
        System.out.println("BEFORE SHUFFLE: ");
        System.out.println(deck.toString());
        deck.shuffle();
        System.out.println("AFTER RANDOM SHUFFLE: ");
        System.out.println(deck.toString());
        deck.alternatingColorShuffle();
        System.out.println("AFTER COLOR SHUFFLE: ");
        System.out.println(deck.toString());

        System.out.println("====================== Q2 =========================");
        System.out.println(lowestSameDigitNum(100, 500));
    }

    // assuming both min and max are inclusive
    private static int lowestSameDigitNum(int min, int max) {
        for (int i = min; i <= max; i++) {
            int num = i;
            int digit = num % 10;
            while (num != 0) {
                if (digit != num % 10) {
                    break;
                }
                num /= 10;
            }

            if (num == 0) {
                return i;
            }
        }
        // didn't find any num that satisfies condition
        return -1;
    }
}
