package strategy;

public class MobilePayment implements PaymentStrategy {
    private String mobileNumber;

    public MobilePayment(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Processing mobile payment of $" + amount + " to mobile number: " + mobileNumber);
        // Additional logic for mobile payment
    }
}
