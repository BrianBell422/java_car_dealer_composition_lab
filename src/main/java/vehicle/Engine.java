package vehicle;

import behaviours.IEngines;
import behaviours.ITyres;

public class Engine implements IEngines {

    private String fuel;
    private int power;

    public Engine(String fuel, int power) {
        this.fuel = fuel;
        this.power = power;
    }

    public String getFuel() {
        return fuel;
    }

    public int getPower() {
        return power;
    }


}
