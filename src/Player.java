import java.awt.*;
import java.util.ArrayList;

public class Player {
    public int x;
    public int y;
    private ArrayList<Card> cards = new ArrayList<>();

    public Player(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void addCard(Card card){
        cards.add(card);
    }

    public void removeCard(Card card){
        cards.remove(card); //TODO TEST IF .EQUALS OR ==
    }
}
