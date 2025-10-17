package org.example.strategy;



/*   Estrategia
 Interfaz Strategy: Define el contrato para las estrategias de ataque
 */

public interface EstrategiaAtaque {

    int calcularDano(); //Metoo calcular daño
    String getNombreEstrategia(); //Traer namobre de la estrategia

}
