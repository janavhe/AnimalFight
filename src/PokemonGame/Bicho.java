package PokemonGame;

public class Bicho extends Pokemon implements DebilContraFuego{

    public Bicho() {
    }

    public Bicho(String nombre, String tipo, Integer vida, Integer ataque) {
        super(nombre, tipo, vida, ataque);
    }


    @Override
    public void debilContraFuego(Fuego atacante) {
        this.setVida(this.getVida()-2*atacante.ataque);
        System.out.println("La vida de "+this.nombre+" bajo a "+this.getVida());

    }
}

