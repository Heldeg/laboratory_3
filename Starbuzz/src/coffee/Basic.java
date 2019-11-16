package coffee;

public class Basic extends Beverage {
    public Basic() {
        setDescription("coffee without milk and cook time > 2 minutes.");
    }

    @Override
    public int cost() {
        return 125;
    }
}
