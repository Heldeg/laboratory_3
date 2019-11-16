package coffee;

public class Simple extends Beverage {
    public Simple() {
        setDescription("just coffee.");
    }

    @Override
    public int cost() {
        return 100;
    }
}
