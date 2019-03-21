import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealerTest {

    Card card;
    Deck deck;
    Dealer dealer;


    @Before
    public void setup(){
        card = new Card(SuitType.HEARTS, RankTypes.QUEEN);
        deck = new Deck();
        dealer = new Dealer();
    }

    @Test
    public void canDeal(){
        dealer.dealCard(card, deck);
        assertEquals(1, dealer.countHand());
    }


}
