package decorator;

public class Espresso extends Coffee {
    @Override
    public String getName() {
        return "Espresso";
    }

    @Override
    public int cost() {
        return 5;
    }
}
