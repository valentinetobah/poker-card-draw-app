package za.co.advance;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import za.co.advance.pojos.Hand;

public class PokerCardDrawAppTest {

    PokerCardDrawApp app = new PokerCardDrawApp();
    @Test
    public void dealSingleHandWithFiveCards() {
        Hand hand = app.dealSingleHand(5);
        assertEquals(5, hand.getCards().size());
    }

    @Test
    public void dealSingleHandWithSevenCards() {
        Hand hand = app.dealSingleHand(7);
        assertEquals(7, hand.getCards().size());
    }

    @Test
    public void evaluateHand() {
    }
}