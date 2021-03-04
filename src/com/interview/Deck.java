package com.interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

enum Suit {
    HEARTS, DIAMONDS, CLUBS, SPADES
}

enum Rank {
    TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE
}

public class Deck {
    private List<Card> deck;

    public Deck() {
        deck = new ArrayList<Card>();
        Suit[] suits = Suit.values();
        Rank[] ranks = Rank.values();

        for (int i = 0; i < ranks.length; i++) {
            for (int j = 0; j < suits.length; j++) {
                deck.add(new Card(ranks[i], suits[j]));
            }
        }
    }

    // NOTE: if library functions are allowed - we can also just use Collections.shuffle(deck)
    public void shuffle() {
        Random rand = new Random();
        for (int i = 0; i < deck.size(); i++) {
            Collections.swap(deck, i, i + rand.nextInt(deck.size() - i));
        }
    }

    public void alternatingColorShuffle() throws Exception {
        List<Card> coloredShuffle = new ArrayList<>(Collections.nCopies(deck.size(), new Card(null, null)));
        int redIdx = 0;
        int blackIdx = 1;
        for (int i = 0; i < deck.size(); i++) {
            Card card = deck.get(i);
            switch (card.suit) {
                // red
                case HEARTS:
                case DIAMONDS:
                    coloredShuffle.set(redIdx, card);
                    redIdx += 2;
                    break;
                // black
                case CLUBS:
                case SPADES:
                    coloredShuffle.set(blackIdx, card);
                    blackIdx += 2;
                    break;
                default:
                    throw new Exception("Unrecognized suit");
            }
        }

        deck = coloredShuffle;
    }

    public List<Card> get() {
        return deck;
    }

    @Override
    public String toString() {
        return deck.toString();
    }
}
