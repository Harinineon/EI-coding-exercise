package decorator;

public class MochaDecorator extends CoffeeDecorator {
    public MochaDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getName() {
        return coffee.getName() + ", with Mocha";
    }

    @Override
    public int cost() {
        return coffee.cost() + 3;
    }
}
