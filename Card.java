public class Card implements Comparable{
    private char val;
    private char suit;

    public static char[] values = {'2', '3', '4', '5', '6', '7', '8', '9', 'T', 'J', 'Q', 'K', 'A'};
    public static char[] suits = {'♣', '♢', '♠', '♡'};

    public Card(char val, char suit) {
        this.val = val;
        this.suit = suit;
    }

    public int getCompVal(){
        int suitVal=0;
        int valVal=0;

        for (int i = 0; i < suits.length; i++){
            if (this.suit == suits[i]){
                suitVal = 4*i;
            }
        }

        for (int i = 0; i < values.length; i++){
            if (this.val == values[i]){
                valVal = i;
            }
        }

        return suitVal + valVal;
    }

    public int compareTo(Object otherCard){
        Card other = (Card) otherCard;
        return this.getCompVal() - other.getCompVal();
    }
}
