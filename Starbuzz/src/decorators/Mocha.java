package decorators;

import coffee.Beverage;

public class Mocha extends CondimentDecorator{
    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+"addition of "+"Mocha";
    }

    @Override
    public int cost() {
        return 50;
    }
}
