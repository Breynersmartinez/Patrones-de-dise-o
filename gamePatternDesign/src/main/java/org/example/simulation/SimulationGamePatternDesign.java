
package main.java.org.example.simulation;
 import main.java.org.example.entity.Personaje;
 import main.java.org.example.service.JuegoLuchaService;

import java.util.*;
import java.util.Scanner;

public class SimulationGamePatternDesign {

    public void run() {


        Scanner scanner = new Scanner(System.in);

        System.out.print(" Introduce el nombre del jugador 1:");
        String nombre1 = scanner.nextLine();

        System.out.print(" Introduce el nombre del jugador 2:");
        String nombre2 = scanner.nextLine();

        JuegoLuchaService juego = new JuegoLuchaService(nombre1, nombre2);
        juego.iniciarPelea();


    }
}
