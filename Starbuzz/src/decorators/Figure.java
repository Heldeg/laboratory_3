package decorators;

import coffee.Beverage;

public class Figure extends CondimentDecorator {
    private Beverage beverage;

    public Figure(Beverage beverage) {
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
