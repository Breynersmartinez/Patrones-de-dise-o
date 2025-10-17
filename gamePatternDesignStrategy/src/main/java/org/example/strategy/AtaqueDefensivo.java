package org.example.strategy;

import java.util.Random;

public class AtaqueDefensivo implements EstrategiaAtaque {
    private final int MAX_DANO = 20;
    private final int MIN_DANO = 15;

    @Override
    public int calcularDano() {
        Random rand = new Random();
        return rand.nextInt((MAX_DANO - MIN_DANO) + 1) + MIN_DANO;
    }

    @Override
    public String getNombreEstrategia() {
        return "Ataque Defensivo";
    }
}



