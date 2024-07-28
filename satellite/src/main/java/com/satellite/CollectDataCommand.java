package com.satellite;

public class CollectDataCommand implements SatelliteCommand {
    @Override
    public void execute(Satellite satellite) {
        if (satellite.areSolarPanelsActive()) {
            satellite.collectData();
        } else {
            System.out.println("Data can't be collected. Solar panels are not active.");
        }
    }
}
