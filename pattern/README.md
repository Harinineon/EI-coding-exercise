## Design Patterns Implemented

#### Observer Pattern

- **Description**: The observer pattern is used to notify multiple objects about state changes in another object.
- **Usage**: In this project, the observer pattern is used to notify customers when their order status changes.
- **Files**:
  - `observer/Observer.java`: The observer interface.
  - `observer/Customer.java`: Concrete observer implementation.
  - `observer/Order.java`: The subject that notifies observers of changes.

#### Logger Pattern

- **Description**: The logger pattern is used to log events for debugging and monitoring.
- **Usage**: In this project, the logger is used to log information such as order details, payment status, and errors.
- **Files**:
  - `logger/Logger.java`: Factory class for creating loggers.

#### Strategy Pattern

- **Description**: The strategy pattern defines a family of algorithms and makes them interchangeable.
- **Usage**: In this project, the strategy pattern is used for different payment methods.
- **Files**:
  - `strategy/PaymentStrategy.java`: The strategy interface.
  - `strategy/CreditCardPayment.java` and `strategy/PayPalPayment.java`: Concrete strategy implementations.

#### Factory Pattern

- **Description**: The factory pattern is used to create objects without specifying the exact class of the object that will be created.
- **Usage**: In this project, the factory pattern is used to create different types of coffee.
- **Files**:
  - `factory/CoffeeFactory.java`: The factory interface.
  - `factory/EspressoFactory.java` and `factory/LatteFactory.java`: Concrete factory implementations.

#### Decorator Pattern

- **Description**: The decorator pattern is used to add new functionality to an object dynamically.
- **Usage**: In this project, the decorator pattern is used to add different ingredients to coffee.
- **Files**:
  - `decorator/Coffee.java`: The component interface.
  - `decorator/Espresso.java`, `decorator/Latte.java`: Concrete component implementation.
  - `decorator/CoffeeDecorator.java`: Decorator base class.
  - `decorator/MilkDecorator.java`,`decorator/SoyDecorator.java` and `decorator/MochaDecorator.java`: Concrete decorators.

#### Adapter Pattern

- **Description**: The adapter pattern allows incompatible interfaces to work together.
- **Usage**: In this project, the adapter pattern is used to integrate a third-party payment gateway.
- **Files**:
  - `adapter/StripePayment.java`: The adaptee class.
  - `adapter/StripeAdapter.java`: The adapter class.
  - `adapter/PaymentGateway.java`: The target interface.
    
## Contact

For any questions or suggestions, please contact me at [your-email@example.com].
