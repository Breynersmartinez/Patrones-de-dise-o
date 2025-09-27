package org.example.Simulation;
import org.example.Decorator.Vehicle;

import java.text.NumberFormat;
import java.util.*;


public class FormatCopColombia {

    public static String toCop(Double value )
    {
        // Formato de pesos colombianos

        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(new Locale("es", "CO"));
        return currencyFormat.format(value);

    }

}
