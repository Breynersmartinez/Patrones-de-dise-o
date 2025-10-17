package org.example.strategy;


import java.util.Random;

public class AtaqueCritico implements EstrategiaAtaque {
    private final int DANO_CRITICO = 50;
    private final int DANO_FALLO = 5;
    private final double PROBABILIDAD_CRITICO = 0.3; // 30% de probabilidad

    @Override
    public int calcularDano() {


        Random rand = new Random();
        if (rand.nextDouble() < PROBABILIDAD_CRITICO) {
            return DANO_CRITICO;
        }
        return DANO_FALLO;
    }

    @Override
    public String getNombreEstrategia() {
        return "Ataque Crítico";
    }
}
