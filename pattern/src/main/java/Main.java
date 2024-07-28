import java.util.Scanner;
import factory.*;
import decorator.*;
import observer.Order;
import strategy.PaymentStrategy;
import strategy.CreditCardPayment;
import strategy.PayPalPayment;
import strategy.PaymentGateway;
import strategy.PaymentGatewayImpl;
import adapter.StripeAdapter;
import logger.Logger;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Logger logger = Logger.getInstance();

        try {
            // Get customer details
            System.out.print("Enter your name: ");
            String customerName = scanner.nextLine();

            // Display available coffee types
            System.out.println("\n=== Available Coffee Types ===");
            System.out.println("1. Espresso");
            System.out.println("2. Latte");
            System.out.print("Enter the number of the coffee type you want (1/2): ");
            int coffeeChoice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            CoffeeFactory coffeeFactory;
            switch (coffeeChoice) {
                case 1:
                    coffeeFactory = new EspressoFactory();
                    break;
                case 2:
                    coffeeFactory = new LatteFactory();
                    break;
                default:
                    System.out.println("Invalid choice. Defaulting to Espresso.");
                    coffeeFactory = new EspressoFactory();
            }
            Coffee coffee = coffeeFactory.createCoffee();
            System.out.println("Created coffee: " + coffee.getName() + " costs $" + coffee.cost());

            // Display available decorations
            System.out.println("\n=== Available Decorations ===");
            System.out.println("1. Milk");
            System.out.println("2. Mocha");
            System.out.println("3. Soy");
            System.out.print("Enter the numbers of decorations you want (comma-separated, e.g., 1,2,3): ");
            String[] decorationChoices = scanner.nextLine().split(",");

            // Apply selected decorations
            Coffee decoratedCoffee = coffee;
            for (String choice : decorationChoices) {
                switch (choice.trim()) {
                    case "1":
                        decoratedCoffee = new MilkDecorator(decoratedCoffee);
                        break;
                    case "2":
                        decoratedCoffee = new MochaDecorator(decoratedCoffee);
                        break;
                    case "3":
                        decoratedCoffee = new SoyDecorator(decoratedCoffee);
                        break;
                    default:
                        System.out.println("Invalid decoration choice: " + choice);
                }
            }

            double totalCost = decoratedCoffee.cost();
            System.out.println("Decorated coffee: " + decoratedCoffee.getName() + " costs $" + totalCost);

            // Create and place the order
            Order order = new Order();
            order.addItem(decoratedCoffee.getName());
            System.out.println("\nPlacing order...");
            order.placeOrder();

            // Payment and verification
            double paymentAmount = 0.0;
            boolean paymentValid = false;
            while (!paymentValid) {
                System.out.print("\nEnter amount to pay: ");
                paymentAmount = scanner.nextDouble();
                if (Math.abs(paymentAmount - totalCost) < 0.01) {
                    paymentValid = true;
                    System.out.println("Payment verified. Amount matches the coffee cost.");
                } else {
                    System.out.println("Payment error. Amount does not match the coffee cost. Please try again.");
                }
            }

            // Demonstrate Strategy Pattern
            PaymentStrategy paymentStrategy = null;
            boolean validPaymentOption = false;
            while (!validPaymentOption) {
                System.out.println("\n=== Strategy Pattern ===");
                scanner.nextLine(); // Consume newline
                System.out.println("Available Payment Methods:");
                System.out.println("1. Credit Card");
                System.out.println("2. PayPal");
                System.out.print("Enter the number of the payment method you want (1/2): ");
                int paymentChoice = scanner.nextInt();
                scanner.nextLine(); // Consume newline
                switch (paymentChoice) {
                    case 1:
                        System.out.print("Enter credit card number: ");
                        String cardNumber = scanner.nextLine();
                        paymentStrategy = new CreditCardPayment(cardNumber);
                        validPaymentOption = true;
                        break;
                    case 2:
                        System.out.print("Enter PayPal email: ");
                        String email = scanner.nextLine();
                        paymentStrategy = new PayPalPayment(email);
                        validPaymentOption = true;
                        break;
                    default:
                        System.out.println("Invalid choice. Please select a valid payment method.");
                }
            }
            PaymentGateway paymentGateway = new PaymentGatewayImpl(paymentStrategy);
            paymentGateway.processPayment(paymentAmount);

            // Demonstrate Adapter Pattern
            System.out.println("\n=== Adapter Pattern ===");
            StripeAdapter stripeAdapter = new StripeAdapter();
            // Use the same totalCost for Stripe payment
            // Simulate payment processing
            String transactionId = stripeAdapter.processPayment(paymentAmount);

            // Demonstrate Singleton Pattern
            System.out.println("\n=== Singleton Pattern ===");
            logger.log("Application started.", Logger.LogLevel.INFO);

            // Generate and display the bill
            System.out.println("\n=== Bill ===");
            System.out.println("Customer Name: " + customerName);
            System.out.println("Transaction ID: " + transactionId);
            System.out.println("Order: " + String.join(", ", order.getItems()));
            System.out.println("Amount: $" + totalCost);
            System.out.println("Payment Method: " + (paymentStrategy instanceof CreditCardPayment ? "Credit Card" : "PayPal"));
            System.out.println("Order Status: " + order.getStatus());

            // Log transaction details
            String paymentMethod = (paymentStrategy instanceof CreditCardPayment) ? "Credit Card" : "PayPal";
            logger.logTransaction(customerName, transactionId, String.join(", ", order.getItems()), paymentMethod, totalCost);

            // Thank you message
            System.out.println("\nThank you for your purchase! Have a good day.");
        } finally {
            scanner.close();
            logger.close();
        }
    }
}
