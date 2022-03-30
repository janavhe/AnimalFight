package PokemonGame;

public class Hielo extends Pokemon implements DebilContraFuego{
    public Hielo() {
    }

    public Hielo(String nombre, String tipo, Integer vida, Integer ataque) {
        super(nombre, tipo, vida, ataque);
    }

    @Override
    public void debilContraFuego(Fuego atacante) {
        this.setVida(this.getVida() - 2 * atacante.ataque);
        System.out.println("La vida de " + this.nombre + " bajo a " + this.getVida());
    }

}
