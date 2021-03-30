package vehicle;

import behaviours.IEngines;
import behaviours.ITyres;

public class Vehicle {

    private VehicleType vehicleType;
    private BodyType bodyType;
    private ITyres tyres;
    private IEngines engine;
    private Double price;
    private String colour;

    public Vehicle(VehicleType vehicleType, BodyType bodyType, ITyres tyres, IEngines engine, Double price, String colour) {
        this.vehicleType = vehicleType;
        this.bodyType = bodyType;
        this.tyres = tyres;
        this.engine = engine;
        this.price = price;
        this.colour = colour;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public Double getPrice() {
        return price;
    }

    public String getColour() {
        return colour;
    }

    public ITyres getTyres() {
        return this.tyres;
    }

    public IEngines getEngine() {
        return this.engine;
    }
}
