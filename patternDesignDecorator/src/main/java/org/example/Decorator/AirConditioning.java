package org.example.Decorator;

public class AirConditioning extends CarDecorator {

    public AirConditioning(Vehicle vehicle) {
        super(vehicle);
    }


    @Override
    public String getDescription() {
        return vehicle.getDescription() + ", Con aire acondicionado ";
    }

    @Override
    public Double getCost() {
        return vehicle.getCost() + 150000;
    }

}


