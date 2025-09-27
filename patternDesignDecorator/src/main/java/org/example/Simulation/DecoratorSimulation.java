package org.example.Simulation;

import org.example.Decorator.AirConditioning;
import org.example.Decorator.BasicCar;
import org.example.Decorator.GpsDecorator;
import org.example.Decorator.Vehicle;

public class DecoratorSimulation {

    public void simulation()
    {

        FormatCopColombia pcop = new FormatCopColombia();

        Vehicle car = new BasicCar();
        System.out.println(car.getDescription() + " ->  " + pcop.toCop(car.getCost()));

        car = new AirConditioning(car);
        System.out.println(car.getDescription() + " ->  " + pcop.toCop(car.getCost()));

        car = new GpsDecorator(car);
        System.out.println(car.getDescription() + " ->  " + pcop.toCop(car.getCost()));


           /*
        car = new AirConditioning( new GpsDecorator(new BasicCar()));
        System.out.println(car.getDescription() + " -> $ " + car.getCost());
*/



    }
}
