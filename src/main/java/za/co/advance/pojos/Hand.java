package za.co.advance.pojos;

import java.util.ArrayList;
import java.util.List;

public class Hand {
    public List<Card> getCards() {
        return cards;
    }

    private List<Card> cards;

    public Hand(){
        cards = new ArrayList<>();
    }

    public void addCard(Card card) {
        cards.add(card);
    }

    public void displayHand() {
        System.out.print("Your hand: ");
        for (Card card : cards) {
            System.out.print(card);
        }
    }

}
