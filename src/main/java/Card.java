

public class Card {

    private SuitType suit;
    private RankTypes rank;


    public Card(SuitType suit, RankTypes rank) {
        this.suit = suit;
        this.rank = rank;

    }

    public SuitType getSuit() {
        return suit;
    }

    public RankTypes getRank() {
        return rank;
    }

    public int getValueFromEnum() {
        return this.rank.getValue();
    }


}
