package PokemonGame;

public class Planta extends Pokemon implements DebilContraFuego{


    public Planta() {
    }

    public Planta(String nombre, String tipo, Integer vida, Integer ataque) {
        super(nombre, tipo, vida, ataque);
    }

    @Override
    public void debilContraFuego(Fuego atacante) {
        this.setVida(this.getVida() - 2 * atacante.ataque);
        System.out.println("La vida de " + this.nombre + " bajo a " + this.getVida());
    }
}
