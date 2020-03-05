public class Player {
    private Hand hand;
    private Deck deck;

    public Player(Deck deck){
        this.deck = deck;
        hand = new Hand(deck);
    }
}
