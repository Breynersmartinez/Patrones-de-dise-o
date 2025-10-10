
package org.example.simulation;




import org.example.service.JuegoLucha;

import java.util.Scanner;

public class SimulationGamePatternDesign {

    public void run() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("===========================================");
        System.out.println("   JUEGO DE LUCHA - PATRÓN STRATEGY");
        System.out.println("===========================================\n");

        System.out.print("Introduce el nombre del jugador 1: ");
        String nombre1 = scanner.nextLine();

        System.out.print("Introduce el nombre del jugador 2: ");
        String nombre2 = scanner.nextLine();

        JuegoLucha juego = new JuegoLucha(nombre1, nombre2);
        juego.iniciarPelea();

        scanner.close();

    }
}
