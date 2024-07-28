package adapter;
 
import java.util.UUID;

public class StripeAdapter {
    
    public static String generateTransactionID() {
        UUID uuid = UUID.randomUUID();
        return uuid.toString().replace("-", "").substring(0, 5); // Shorten the UUID and remove dashes
    }
    // Process payment and return a transaction ID
    public String processPayment(double amount) {
        try {
            // Simulate payment processing with Stripe
            if (amount <= 0) {
                throw new IllegalArgumentException("Amount must be greater than zero.\n");
            }
            
            // Generate a unique transaction ID
            String transactionId = generateTransactionID();
            
            // Mock payment processing
            System.out.println("Processing payment of " + amount + " with Stripe.\n");

            
            System.out.println("Payment processed successfully."+"\n"+"Transaction ID: " + transactionId);
            return transactionId;
        } catch (Exception e) {
            System.out.println("Error processing payment: " + e.getMessage());
            return null;
        }
    }

}
