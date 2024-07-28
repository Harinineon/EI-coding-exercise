# Satellite Command System

## Overview

The Satellite Command System is a Java-based simulation application that demonstrates the use of the Command design pattern. It provides a command-line interface for controlling a satellite, allowing users to perform various operations such as rotating the satellite, activating or deactivating solar panels, and collecting data.

## Features

- **Rotate Satellite:** Rotate the satellite to North, South, East, or West.
- **Manage Solar Panels:** Activate or deactivate the satellite's solar panels.
- **Data Collection:** Collect data if the solar panels are active.
- **Command Pattern Implementation:** Commands are encapsulated as objects, promoting flexibility and extensibility.

## Prerequisites

- Java Development Kit (JDK) 8 or higher
- A modern IDE or text editor (e.g., IntelliJ IDEA, Eclipse, VS Code)

## Getting Started

### Clone the Repository

```bash
git clone https://github.com/Harinineon/EI-coding-exercise.git
cd satellite
```

### Build and Run

1. **Compile the Code:**

   ```bash 
    javac -d build src/main/java/com/satellite/*.java 
   ```

2. **Run the Application:**

   ```bash
   java -cp build com.satellite.Main 
   ```

### Directory Structure

- `src/` - Contains the source code of the application.
  - `com/satellite/` - Contains the main application classes.
    - `Main.java` - Entry point of the application, handles user input and command execution.
    - `Satellite.java` - Represents the satellite with methods to control its state.
    - `SatelliteCommand.java` - Interface for commands.
    - `ActivatePanelsCommand.java` - Command to activate the satellite's solar panels.
    - `DeactivatePanelsCommand.java` - Command to deactivate the satellite's solar panels.
    - `CollectDataCommand.java` - Command to collect data from the satellite.
    - `RotateCommand.java` - Command to rotate the satellite.
- `bin/` - Output directory for compiled classes.

## Code Explanation

### Main Class

The `Main` class is responsible for initializing the satellite and handling user input. It displays a menu for the user to choose commands and executes the selected commands using the Command design pattern.

### Satellite Class

The `Satellite` class manages the satellite's state, including its orientation, solar panel status, and data collection. It provides methods to rotate the satellite, activate or deactivate solar panels, and collect data.

### Command Classes

- **`ActivatePanelsCommand`** - Activates the satellite's solar panels.
- **`DeactivatePanelsCommand`** - Deactivates the satellite's solar panels.
- **`CollectDataCommand`** - Collects data from the satellite if the solar panels are active.
- **`RotateCommand`** - Rotates the satellite to a specified direction (North, South, East, or West).

## Usage

1. **Start the Application:** Run the `Main` class to start the Satellite Command System.

2. **Enter Commands:**
   - **1:** Rotate North
   - **2:** Rotate South
   - **3:** Rotate East
   - **4:** Rotate West
   - **5:** Activate Solar Panels
   - **6:** Deactivate Solar Panels
   - **7:** Collect Data
   - **0:** Quit the application

3. **Command Execution:** Enter the number corresponding to the command you want to execute. The system will respond based on the current state of the satellite and the chosen command.

## Example

```
=====================================
        Satellite Command System     
=====================================
Enter the number corresponding to the command you want to execute. Type '0' to quit.
1. Rotate North
2. Rotate South
3. Rotate East
4. Rotate West
5. Activate Solar Panels
6. Deactivate Solar Panels
7. Collect Data
=====================================
> 1
Rotating satellite to North.
Current satellite state: Satellite [orientation=North, solarPanelsActive=false, dataCollected=0]
=====================================
```

## Contact

For any questions or feedback, please reach out to [harinineon22@gmail.com]
