package decorator;

public class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getName() {
        return coffee.getName() + ", with Milk";
    }

    @Override
    public int cost() {
        return coffee.cost() + 1;
    }
}
