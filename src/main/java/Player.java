import java.util.ArrayList;

public class Player {

    private ArrayList<Card> hand;
    private String name;

    public Player(String name) {
        this.hand = new ArrayList<Card>();
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
