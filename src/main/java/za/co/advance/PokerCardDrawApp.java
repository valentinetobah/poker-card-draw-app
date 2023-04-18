package za.co.advance;

import za.co.advance.pojos.CardDeck;
import za.co.advance.pojos.Hand;

public class PokerCardDrawApp {
    public static void main(String[] args) {
        //deals a single hand with the number of cards provided
        Hand hand = dealSingleHand(5);
        //Displays the cards the hand has
        hand.displayHand();

        evaluateHand(hand);
    }

    public static Hand dealSingleHand(int NumOfCards){
        Hand hand = new Hand();
        //Creating a deck of 52cards
        CardDeck cardDeck = new CardDeck();

        //call the shuffle method to shuffle the deck of cards
        System.out.println("Shuffling ... Shuffling ... Shuffling ...");
        cardDeck.shuffle();

        //deal the provided cards to a hand
        for(int i = 1; i <= NumOfCards; i++){
            hand.addCard(cardDeck.draw());
        }
        return hand;
    }

    /*
    Couldn't find any poker hand evaluator libraries to use.
    Don't have the time to write a custom hand evaluator hence the below
     */
    public static void evaluateHand(Hand hand){
        System.out.println("\nYou have: ");

    }

}