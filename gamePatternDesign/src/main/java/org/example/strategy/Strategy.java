import main.java.org.example.entity.Personaje;

public interface Strategy {

    
    // Metodo para atacar a otro personaje
    void atacar(Personaje oponente);

    // Metodo para recibir dano

    void recibirDano(int dano);

    // Verifica si el personaje sigue vivo
    boolean estaVivo();

    // Devuelve el nombre del personaje
    String getNombre();

    // Devuelve los puntos de vida actuales
    int getPuntosDeVida();
}
