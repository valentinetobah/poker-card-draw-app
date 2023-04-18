package za.co.advance.pojos;

import za.co.advance.enums.CardSuit;

public class Card {
    private String rank;
    private CardSuit suit;

    public Card(String rank, CardSuit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public String getRank() {
        return rank;
    }

    public CardSuit getSuit() {
        return suit;
    }

    public String toString() {
        return rank + suit.getSuitSymbol() +" ";
    }

}
