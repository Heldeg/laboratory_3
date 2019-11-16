package decorators;

import coffee.Beverage;

public class Milk extends CondimentDecorator {
    private Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+"addition of "+"Milk";
    }

    @Override
    public int cost() {
        return 50;
    }
}
