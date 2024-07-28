# Java Mini Projects Repository

This repository contains two Java mini projects: one focusing on software design patterns and the other on a satellite simulation. Each project demonstrates unique concepts and solutions in Java programming.

## Projects

### 1. Design Patterns Coffee Shop

#### Problem Statement

This project demonstrates various software design patterns implemented in a coffee shop scenario. It includes examples of behavioral, creational, and structural design patterns. The goal is to showcase the practical application of these patterns in a real-world context.

#### Design Patterns Implemented

- **Observer Pattern**: Notifies customers when their order status changes.
- **Strategy Pattern**: Manages different payment methods.
- **Factory Pattern**: Creates different types of coffee.
- **Decorator Pattern**: Adds different ingredients to coffee.
- **Adapter Pattern**: Integrates a third-party payment gateway.
- **Logger**: Logs events for debugging and monitoring.

#### How to Run

1. **Navigate to the Project Directory**:
   ```sh
   cd EI/pattern/src/main/java
   ```

2. **Compile the Project**:
   ```sh
   javac -d ../../build Main.java
   ```

3. **Run the Project**:
   ```sh
   cd ../../build
   java Main
   ```

#### Example Interaction

```
Welcome to the Coffee Shop!

Select your coffee:
1. Espresso
2. Latte
Enter your choice: 1

Select your decoration (1,2,3):
1. Milk
2. Mocha
3.Soy
Enter your choice: 1

Enter amount to pay: 5.00
Payment successful!

----- Bill -----
Customer Name: John Doe
Order: Espresso with Milk
Amount: $5.00
Payment Method: Credit Card
Status: Paid
----------------
Thank you for your purchase! Have a good day!
```

### 2. Satellite Simulation

#### Problem Statement

The satellite simulation project is designed to model the behavior of a satellite orbiting a planet. It simulates various aspects such as orbital parameters, satellite states, and telemetry data.

#### Features

- **Orientation**: Simulates satellite orientation.
- **Panel management**: Activates and deactivates panels based on the command.
- **Collect Data**: Collecting data.

#### How to Run

1. **Navigate to the Project Directory**:
   ```sh
   cd satellite-simulation/src/main/java
   ```

2. **Compile the Project**:
   ```sh
   javac -d ../../build Main.java
   ```

3. **Run the Project**:
   ```sh
   cd ../../build
   java Main
   ```


## Contact

For any questions or suggestions, please contact me at [harinineon22@gmail.com].
```
