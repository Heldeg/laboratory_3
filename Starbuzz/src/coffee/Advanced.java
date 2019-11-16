package coffee;

public class Advanced extends Beverage {
    public Advanced() {
        setDescription("coffee with milk, mocha and a figure in the cover.");
    }

    @Override
    public int cost() {
        return 250;
    }
}
