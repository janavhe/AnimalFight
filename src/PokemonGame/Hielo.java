package PokemonGame;

import java.io.Serializable;

public class Hielo extends Pokemon implements DebilContraFuego, Serializable {

    private static final long serialVersionUID = 2L;
    public Hielo(String nombre, String tipo, Integer vida, Integer ataque) {
        super(nombre, tipo, vida, ataque);
    }

    @Override
    public void debilContraFuego(Fuego atacante) {
        this.setVida(this.getVida() - 2 * atacante.ataque);
        System.out.println("La vida de " + this.nombre + " bajo a " + this.getVida());
    }


    @Override
    public String toString() {
        return "Hielo{" +
                "nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                ", vida=" + vida +
                ", ataque=" + ataque +
                ", hielo=" + hielo +
                '}';
    }
}
