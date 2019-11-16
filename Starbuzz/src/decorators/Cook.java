package decorators;

import coffee.Beverage;

public class Cook extends CondimentDecorator {
    private Beverage beverage;

    public Cook(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+"addition of "+"Mocha";
    }

    @Override
    public int cost() {
        return 25;
    }
}
