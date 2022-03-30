package PokemonGame;

public class Fuego extends Pokemon implements DebilContraAgua,DebilContraTierra{

    public Fuego() {
    }

    public Fuego(String nombre, String tipo, Integer vida, Integer ataque) {
        super(nombre, tipo, vida, ataque);
    }


    @Override
    public void debilContraAgua(Agua atacante) {
        this.setVida(this.getVida()-2*atacante.ataque);
        System.out.println("La vida de "+this.nombre+" bajo a "+this.getVida());
    }

    @Override
    public void debilContraTierra(Tierra atacante) {
        this.setVida(this.getVida() - 2 * atacante.ataque);
        System.out.println("La vida de " + this.nombre + " bajo a " + this.getVida());

    }
}

