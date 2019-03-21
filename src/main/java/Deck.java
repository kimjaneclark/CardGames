import java.util.ArrayList;

public class Deck {


    private ArrayList<Card> cards;
//
//
    public Deck() {

        this.cards = new ArrayList<Card>();
        this.shuffle();

    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public int countDeck() {
        return this.cards.size();
    }

    public void populateDeck() {

        for (SuitType s : SuitType.values()) {
            for (RankTypes r : RankTypes.values()) {
                Card card = new Card(s, r);
                    this.cards.add(card);
                }
            }
        }

    public void shuffle(){


        while (cards.size() > 0) {
            int index = (int) (Math.random() * cards.size());
            cards.add(cards.remove(index));
        }
    }

    public Card takeCardFromDeck(Card card){
        return this.cards.remove(0);
    }
    }

