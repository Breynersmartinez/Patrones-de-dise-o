package org.example.Decorator;

import org.example.Simulation.FormatCopColombia;


public class GpsDecorator extends CarDecorator{


    public GpsDecorator(Vehicle vehicle) {
        super(vehicle);
    }

    @Override
    public String getDescription()
    {
        return vehicle.getDescription() + ", con Gps ";
    }

    @Override
    public Double getCost()
    {
        return vehicle.getCost() + 450000.00;
    }


    /*
    FormatCopColombia pcop = new FormatCopColombia();
    @Override
    public String toString() {
        return getDescription() + " ->  " + pcop.toCop(getCost());
    }

     */
}
