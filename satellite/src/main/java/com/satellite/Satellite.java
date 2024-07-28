package com.satellite;

public class Satellite {
    private String orientation;
    private boolean solarPanelsActive;
    private int dataCollected;

    public Satellite() {
        this.orientation = "North";
        this.solarPanelsActive = false;
        this.dataCollected = 0;
    }

    public void rotate(String direction) {
        this.orientation = direction;
    }

    public void activatePanels() {
        this.solarPanelsActive = true;
    }

    public void deactivatePanels() {
        this.solarPanelsActive = false;
    }

    public void collectData() {
        if (this.solarPanelsActive) {
            this.dataCollected += 10;
        } else {
            throw new IllegalStateException("Cannot collect data. Solar panels are not active.");
        }
    }

    public boolean areSolarPanelsActive() {
        return this.solarPanelsActive;
    }

    @Override
    public String toString() {
        return "Satellite [orientation=" + orientation + ", solarPanelsActive=" + solarPanelsActive + ", dataCollected=" + dataCollected + "]";
    }
}
