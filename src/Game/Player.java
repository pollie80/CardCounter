package Game;

import java.util.ArrayList;

public class Player {
    private int number;
    private ArrayList<Card> cards = new ArrayList<>();

    public Player(int number) {
        this.number = number;
    }

    public void addCard(Card card){
        cards.add(card);
    }

    public void removeCard(Card card){
        cards.remove(card); //TODO TEST IF .EQUALS OR ==
    }

    public String getName(){
        return "Player "+number;
    }
}
