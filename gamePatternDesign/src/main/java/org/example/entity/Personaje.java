package main.java.org.example.entity;
import main.java.org.example.strategy.Strategy;



import java.util.Random;
import java.util.Scanner;

@SuppressWarnings("ALL") // Notacion para suprimir todas las advertencias del compilador
public class Personaje implements Strategy{

    private String nombre;
    private int puntosDeVida;
    private final int MAX_DANO = 30;
    private final int MIN_DANO = 10;// Constructor para inicializar los datos del personaje

    public Personaje(String nombre) {
        this.nombre = nombre;
        this.puntosDeVida = 100; // Todos comienzan con 100puntos de vida
    } // Metodo para realizar un ataque a otro personaje

    @Override
    public void atacar(Personaje oponente) {
        Random rand = new Random();
        int dano = rand.nextInt((MAX_DANO - MIN_DANO) + 1) +
                MIN_DANO; // Dano entre 10 y 30
        oponente.recibirDano(dano);
        System.out.println(this.nombre + " ataca a " +
                oponente.getNombre() + " causando " + dano + "puntos de dano .");
    }

    // Metodo para recibir dano
    @Override
    public void recibirDano(int dano) {
        this.puntosDeVida -= dano;
        if (this.puntosDeVida < 0) {
            this.puntosDeVida = 0; // No se puede tenermenos de 0 puntos de vida
        }
    } 
    
    // Verifica si el personaje sigue vivo
    @Override
    public boolean estaVivo() {
        return this.puntosDeVida > 0;
    } // Devuelve el nombre del personaje

    @Override
    public String getNombre() {
        return this.nombre;
    } // Devuelve los puntos de vida actuales
    @Override
    public int getPuntosDeVida() {
        return this.puntosDeVida;
    }
}
