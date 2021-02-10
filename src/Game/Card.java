package Game;

public class Card {
    private Symbol symbol;
    private Number number;

    enum Symbol {
        Clubs,
        Diamonds,
        Hearts,
        Spades
    }
    //based on https://stackoverflow.com/questions/3990319/storing-integer-values-as-constants-in-enum-manner-in-java
    //numbers based on rummy
    enum Number{
        ACE(11),
        ONE(1),
        TWO(2),
        THREE(3),
        FOUR(4),
        FIVE(5),
        SIX(6),
        SEVEN(7),
        EIGHT(8),
        NINE(9),
        TEN(10),
        JACK(10),
        QUEEN(10),
        KING(10);

        private final int value;

        Number(final int newValue) {
            value = newValue;
        }

        public int getValue() { return value; }
    }

    public Card(Symbol symbol, Number number) {
        this.symbol = symbol;
        this.number = number;
    }
}
