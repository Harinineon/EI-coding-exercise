package adapter;

public class StripePayment {
    public void makePayment(double amount) {
        System.out.println("Processing payment of $" + amount + " via Stripe");
    }
}
