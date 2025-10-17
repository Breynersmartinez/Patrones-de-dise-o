package org.example.entity;



import org.example.strategy.EstrategiaAtaque;


public class Personaje   {

    private String nombre;
    private int puntosDeVida;
    private EstrategiaAtaque estrategia; // Composición: el personaje TIENE una estrategia

    // Constructor
    public Personaje(String nombre, EstrategiaAtaque estrategia) {
        this.nombre = nombre;
        this.puntosDeVida = 100;
        this.estrategia = estrategia;
    }

    // Método para cambiar la estrategia en tiempo de ejecución
    public void setEstrategia(EstrategiaAtaque estrategia) {
        this.estrategia = estrategia;
        System.out.println(this.nombre + " cambió a " + estrategia.getNombreEstrategia());
    }

    // Método para atacar usando la estrategia actual
    public void atacar(Personaje oponente) {
        int dano = estrategia.calcularDano(); // Entonces Delega el calculo a la estrategi
        // entonces el oponente recibe el daño
        oponente.recibirDano(dano);
        System.out.println(this.nombre + " usa " + estrategia.getNombreEstrategia() +
                " contra " + oponente.getNombre() + " causando " +
                dano + " puntos de daño.");
    }

    // Método para recibir daño
    public void recibirDano(int dano) {
        this.puntosDeVida -= dano;
        if (this.puntosDeVida < 0) {
            this.puntosDeVida = 0;
        }
    }

    // Verifica si el personaje sigue vivo
    public boolean estaVivo() {
        return this.puntosDeVida > 0;
    }

    // Getters
    public String getNombre() {
        return this.nombre;
    }

    public int getPuntosDeVida() {
        return this.puntosDeVida;
    }


    //Se trae la estrategia Actual utilizada por el personaje
    public String getEstrategiaActual() {
        return estrategia.getNombreEstrategia();
    }

}
