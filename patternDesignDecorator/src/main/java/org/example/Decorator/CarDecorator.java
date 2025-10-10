package org.example.Decorator;

import org.example.Simulation.FormatCopColombia;

public abstract class CarDecorator implements Vehicle {
    protected Vehicle vehicle;


    public CarDecorator(Vehicle vehicle) {
        this.vehicle = vehicle;
    }


    public String getDescription() {
        return vehicle.getDescription();
    }


    public Double getCost() {
        return vehicle.getCost();
    }


    /*
    FormatCopColombia pcop = new FormatCopColombia();

    @Override
    public String toString() {
        return getDescription() + " ->  " + pcop.toCop(getCost());
    }

     */
}

