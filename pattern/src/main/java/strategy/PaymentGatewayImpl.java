package strategy;

public class PaymentGatewayImpl implements PaymentGateway {
    private PaymentStrategy paymentStrategy;

    public PaymentGatewayImpl(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    @Override
    public void processPayment(double amount) {
        paymentStrategy.pay(amount);
    }
}
