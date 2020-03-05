public class Card {
    private char val;
    private char suit;

    public static char[] values = {'2', '3', '4', '5', '6', '7', '8', '9', 'T', 'J', 'Q', 'K'};
    public static char[] suits = {'♣', '♢', '♠', '♡'};

    public Card(char val, char suit) {
        this.val = val;
        this.suit = suit;
    }
}
