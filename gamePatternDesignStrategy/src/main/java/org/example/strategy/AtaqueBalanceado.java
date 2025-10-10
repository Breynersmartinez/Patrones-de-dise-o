package org.example.strategy;
import java.util.Random;



public class AtaqueBalanceado implements EstrategiaAtaque {
    private final int MAX_DANO = 30;
    private final int MIN_DANO = 10;

    @Override
    public int calcularDano() {
        Random rand = new Random();
        return rand.nextInt((MAX_DANO - MIN_DANO) + 1) + MIN_DANO;
    }

    @Override
    public String getNombreEstrategia() {
        return "Ataque Balanceado";
    }
}
