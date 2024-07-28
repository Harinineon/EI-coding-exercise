package factory;

import decorator.Coffee;
import decorator.Espresso;

public class EspressoFactory extends CoffeeFactory {
    @Override
    public Coffee createCoffee() {
        return new Espresso();
    }
}

