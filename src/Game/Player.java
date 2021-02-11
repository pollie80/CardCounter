package Game;

import GUI.GUI;

import java.util.ArrayList;

public class Player {
    private int number;
    private ArrayList<Card> cards = new ArrayList<>();

    public Player(int number) {
        this.number = number;
    }

    public void addCard(Card card){
        cards.add(card);
        System.out.println(getName() + " received card " + card);
        GUI.refreshCards();
    }

    public void removeCard(Card card){
        cards.remove(card); //TODO TEST IF .EQUALS OR ==
        GUI.refreshCards();
    }

    public String getCardsAsString(){
        StringBuilder stringForCards = new StringBuilder();
        for(Card c: cards){
            stringForCards.append(c).append(", ");
        }
        String finalString = stringForCards.toString();
        if (finalString.length() > 1)
            finalString = finalString.substring(0, finalString.length()-2);

        return finalString;
    }

    public String getName(){
        return "Player "+number;
    }
}
