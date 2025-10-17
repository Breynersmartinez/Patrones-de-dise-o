package org.example.service;


import org.example.entity.Personaje;
import org.example.strategy.*;

import java.util.Scanner;

public class JuegoLucha {
    private Personaje jugador1;
    private Personaje jugador2;
    private Scanner scanner;

    // Constructor para inicializar los personajes
    public JuegoLucha(String nombre1, String nombre2) {
        this.scanner = new Scanner(System.in);

        // Permitir que cada jugador elija su estrategia inicial
        System.out.println("\n" + nombre1 + ", elige tu estrategia:");
        EstrategiaAtaque estrategia1 = elegirEstrategia();
        this.jugador1 = new Personaje(nombre1, estrategia1);

        System.out.println("\n" + nombre2 + ", elige tu estrategia:");
        EstrategiaAtaque estrategia2 = elegirEstrategia();
        this.jugador2 = new Personaje(nombre2, estrategia2);
    }

    // Método que se desarrollo para elegir estrategia
    private EstrategiaAtaque elegirEstrategia() {
        //Opciones de ataque
        System.out.println("1. Ataque Agresivo (20-35 daño)");
        System.out.println("2. Ataque Defensivo (15-20 daño)");
        System.out.println("3. Ataque Balanceado (10-30 daño)");
        System.out.println("4. Ataque Crítico (30% de 50 daño, 70% de 5 daño)");
        System.out.print("Selecciona (1-4): ");

        int opcion = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer



        // Uso de la nueva sentencia  switch de java
         return switch (opcion)
        {
            case  1 ->    new AtaqueAgresivo();
            case  2 ->   new AtaqueDefensivo();
            case  3 ->   new AtaqueBalanceado();
            case  4 ->   new AtaqueCritico();
            default ->   new AtaqueBalanceado();
        };


    }

    // Método para iniciar la pelea
    public void iniciarPelea() {
        System.out.println("\n___________________________________________");
        System.out.println("La pelea comienza entre " + jugador1.getNombre() +
                " y " + jugador2.getNombre() + "!");
        System.out.println("___________________________________________\n");

        int turno = 1;
        while (jugador1.estaVivo() && jugador2.estaVivo()) {
            System.out.println("--- TURNO " + turno + " ---");

            // Turno del jugador 1
            turnoPersonaje(jugador1, jugador2);

            if (jugador2.estaVivo()) {
                // Turno del jugador 2
                turnoPersonaje(jugador2, jugador1);
            }

            System.out.println();
            turno++;
        }

        // Mostrar el ganador
        System.out.println("___________________________________________");
        if (jugador1.estaVivo()) {
            System.out.println(" " + jugador1.getNombre() + " ha ganado la pelea!");
        } else {
            System.out.println(" " + jugador2.getNombre() + " ha ganado la pelea!");
        }
        System.out.println("___________________________________________");
    }

    // Método que representa un turno
    private void turnoPersonaje(Personaje atacante, Personaje defensor) {
        System.out.println("\n Turno de " + atacante.getNombre() +
                " (HP: " + atacante.getPuntosDeVida() +
                ", Estrategia: " + atacante.getEstrategiaActual() + ")");
        System.out.println("   Oponente: " + defensor.getNombre() +
                " (HP: " + defensor.getPuntosDeVida() + ")");

        atacante.atacar(defensor);

        System.out.println("   " + defensor.getNombre() + " ahora tiene " +
                defensor.getPuntosDeVida() + " HP");
    }

}