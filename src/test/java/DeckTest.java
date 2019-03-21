import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckTest {

    Card card;
    Deck deck;

    @Before
    public void setup(){
        card = new Card(SuitType.HEARTS, RankTypes.QUEEN);
        deck = new Deck();

    }


    @Test
    public void canPopulateDeck(){
      deck.populateDeck();
        assertEquals(52, deck.countDeck());
    }

    @Test
    public void canRemoveCardFromDeck(){
        deck.populateDeck();
        deck.takeCardFromDeck(card);
        assertEquals(51, deck.countDeck());
    }




}
