package com.satellite;

public class RotateCommand implements SatelliteCommand {
    private final String direction;

    public RotateCommand(String direction) {
        if (direction == null || direction.isEmpty() ||
            (!direction.equals("North") && !direction.equals("South") && 
             !direction.equals("East") && !direction.equals("West"))) {
            throw new IllegalArgumentException("Invalid direction: " + direction);
        }
        this.direction = direction;
    }

    @Override
    public void execute(Satellite satellite) {
        satellite.rotate(direction);
    }
}
