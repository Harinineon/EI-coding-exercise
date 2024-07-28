package factory;

import decorator.Coffee;
import decorator.Latte;

public class LatteFactory extends CoffeeFactory {
    @Override
    public Coffee createCoffee() {
        return new Latte();
    }
}

