import java.util.ArrayList;
import java.util.Collections;

public class Deck{
    private ArrayList<Card> cards;

    public Deck(){
        for (char suit: Card.suits){
            for (char val: Card.values){
                cards.add(new Card(val, suit));
            }
        }

        shuffle();
    }

    public void shuffle(){
        Collections.shuffle(cards);
    }

    public Card draw(){
        return cards.remove(0);
    }

    public void add(Card card){
        cards.add(card);
    }

    public int size(){
        return cards.size();
    }

    public void remove(Card card){
        for (int i = 0; i < cards.size(); ++i){
            if (cards.get(i) == card){
                remove(i);
            }
        }
    }

    public Card remove(int i){
        return cards.remove(i);
    }
}
