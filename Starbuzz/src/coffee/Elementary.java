package coffee;

public class Elementary extends Beverage {
    public Elementary() {
        setDescription("Coffee with milk.");
    }

    @Override
    public int cost() {
        return 150;
    }
}
