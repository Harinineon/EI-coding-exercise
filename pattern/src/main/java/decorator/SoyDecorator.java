package decorator;

public class SoyDecorator extends CoffeeDecorator {
    public SoyDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getName() {
        return coffee.getName() + ", with Soy";
    }

    @Override
    public int cost() {
        return coffee.cost() + 2;
    }
}
