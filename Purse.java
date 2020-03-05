import java.util.ArrayList;

public class Purse {
    private ArrayList<Coin> coins;

    public Purse(){
        coins = new ArrayList<>();
    }

    public void add(Coin coin){
        coins.add(coin);
        }

    public int count(Coin coin){
        int count = 0;

        for (Coin temp : coins){
            if (temp.getName().equals(coin.getName())){
                ++count;
            }
        }

        return count;
    }

    public Coin findSmallest(){
        if (coins.size() > 0 ){
            Coin smallest = coins.get(0);

            for (Coin coin: coins){
                if (coin.getValue() < smallest.getValue()){
                    smallest = coin;
                }
            }

            return smallest;
        }

        return (new Coin(0, "error"));
    }

    public double getTotal(){
        double count = 0;

        for (Coin coin: coins){
            count += coin.getValue();
        }

        return count;
    }
}
