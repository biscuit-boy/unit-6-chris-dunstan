import java.util.ArrayList;

public class Hand {
    private ArrayList<Card> cards;
    private Deck deck;

    public static final int HAND_SIZE = 7;

    public Hand(Deck deck) {
        this.deck = deck;

        addCards();
    }

    public void addCards(){
        for (int i = 0; i < HAND_SIZE - cards.size(); ++i){
            if (deck.size() > 0){
                cards.add(deck.remove(0));
            }
        }
    }

    public void add(Card card){
        cards.add(card);
    }

    public void remove(Card card){
        for (int i = 0; i < cards.size(); ++i){
            if (cards.get(i) == card){
                remove(i);
            }
        }
    }

    public void remove(int i){
        cards.remove(i);
    }

    public int size(){
        return cards.size();
    }
}
