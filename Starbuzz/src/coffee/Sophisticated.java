package coffee;

public class Sophisticated extends  Beverage {
    public Sophisticated() {
        setDescription("coffee with milk and cook time > 2 minutes.");
    }

    @Override
    public int cost() {
        return 175;
    }
}
