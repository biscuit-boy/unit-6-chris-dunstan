public class Coin {
    private String name;
    private double value;

    public Coin(double value, String name) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public double getValue() {
        return value;
    }

    public String toString(){
        return "[" + name + ", " + value + "]";
    }
}
