import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {

    Card card;

    @Before
    public void serUp(){
        card = new Card(SuitType.HEARTS, RankTypes.QUEEN);
    }

    @Test
    public void canGetSuit(){
        assertEquals(SuitType.HEARTS, card.getSuit());
    }

    @Test
    public void canGetValueFromCard(){
        assertEquals(1, card.getValueFromEnum());
    }

    @Test
    public void queenHasValue10(){
        card = new Card(SuitType.HEARTS, RankTypes.QUEEN);
        assertEquals(10, card.getValueFromEnum());
    }

    SuitType[] suits = SuitType.values();




}
