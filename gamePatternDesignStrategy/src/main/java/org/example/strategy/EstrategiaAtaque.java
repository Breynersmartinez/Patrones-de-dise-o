package org.example.strategy;



/*   Estrategia
 Interfaz Strategy: Define el contrato para las estrategias de ataque
 */

public interface EstrategiaAtaque {

    int calcularDano();
    String getNombreEstrategia();

}
