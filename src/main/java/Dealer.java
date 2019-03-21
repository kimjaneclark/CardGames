import java.util.ArrayList;

public class Dealer {

    private ArrayList<Card> hand;
    private ArrayList<Card> cards;

    public Dealer() {
        this.hand = new ArrayList<Card>();
        this.cards = new ArrayList<Card>();
    }


    public void dealCard(Card card, Deck deck) {
      deck.takeCardFromDeck(card);
       this.hand.add(card);

    }

    public int countHand() {
        return this.hand.size();
    }
}
