package decorator;

public class Latte extends Coffee {
    @Override
    public String getName() {
        return "Latte";
    }

    @Override
    public int cost() {
        return 6;
    }
}
