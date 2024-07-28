package com.satellite;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        Satellite satellite = new Satellite();
        Scanner scanner = new Scanner(System.in);

        System.out.println("=====================================");
        System.out.println("        Satellite Command System     ");
        System.out.println("=====================================");
        System.out.println("Enter the number corresponding to the command you want to execute. Type '0' to quit.");
        System.out.println("1. Rotate North");
        System.out.println("2. Rotate South");
        System.out.println("3. Rotate East");
        System.out.println("4. Rotate West");
        System.out.println("5. Activate Solar Panels");
        System.out.println("6. Deactivate Solar Panels");
        System.out.println("7. Collect Data");
        System.out.println("=====================================");

        boolean exit = false;

        while (!exit) {
            try {
                System.out.print("> ");
                if (!scanner.hasNextInt()) {
                    throw new InputMismatchException("Invalid input type. Please enter a number between 0 and 7.");
                }
                int commandNumber = scanner.nextInt();

                if (commandNumber == 0) {
                    System.out.println("Exiting the Satellite Command System...");
                    exit = true;
                    continue;
                }

                SatelliteCommand satelliteCommand = null;
                String commandDescription = "";

                switch (commandNumber) {
                    case 1:
                        satelliteCommand = new RotateCommand("North");
                        commandDescription = "Rotating satellite to North.";
                        break;
                    case 2:
                        satelliteCommand = new RotateCommand("South");
                        commandDescription = "Rotating satellite to South.";
                        break;
                    case 3:
                        satelliteCommand = new RotateCommand("East");
                        commandDescription = "Rotating satellite to East.";
                        break;
                    case 4:
                        satelliteCommand = new RotateCommand("West");
                        commandDescription = "Rotating satellite to West.";
                        break;
                    case 5:
                        satelliteCommand = new ActivatePanelsCommand();
                        commandDescription = "Activating solar panels.";
                        break;
                    case 6:
                        satelliteCommand = new DeactivatePanelsCommand();
                        commandDescription = "Deactivating solar panels.";
                        break;
                    case 7:
                        satelliteCommand = new CollectDataCommand();
                        commandDescription = "Attempting to collect data.";
                        break;
                    default:
                        System.out.println("Invalid command. Please enter a number between 0 and 7.");
                        continue;
                }

                if (satelliteCommand != null) {
                    System.out.println(commandDescription);
                    satelliteCommand.execute(satellite);
                    System.out.println("Current satellite state: " + satellite);
                    System.out.println("=====================================");
                }
            } catch (InputMismatchException e) {
                LOGGER.log(Level.WARNING, e.getMessage(), e);
                scanner.next(); // Clear the invalid input
            } catch (IllegalArgumentException | IllegalStateException e) {
                LOGGER.log(Level.WARNING, e.getMessage(), e);
            } catch (NoSuchElementException e) {
                LOGGER.log(Level.SEVERE, "No input provided. Exiting the system.", e);
                exit = true;
            } catch (Exception e) {
                LOGGER.log(Level.SEVERE, "An unexpected error occurred.", e);
            }
        }

        scanner.close();
    }
}
