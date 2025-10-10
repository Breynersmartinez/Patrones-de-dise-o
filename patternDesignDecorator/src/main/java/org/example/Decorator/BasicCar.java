package org.example.Decorator;

import org.example.Simulation.FormatCopColombia;

public class BasicCar implements Vehicle {


    @Override
    public String getDescription() {
        return "Carro basico";
    }

    @Override
    public Double getCost() {
        return 45500000.00;
    }

/*
    FormatCopColombia pcop = new FormatCopColombia();
    @Override
    public String toString() {
        return getDescription() + " ->  " + pcop.toCop(getCost());
    }

 */
}
