package PokemonGame2;

public class Tipo extends Pokemon implements Volador, Fuego{

    public Tipo() {
    }

    public Tipo(String nombre, String tipo, Tipo tipo2, Integer vida, Integer ataque) {
        super(nombre, tipo, tipo2, vida, ataque);
    }

    @Override
    public void esFuego() {

    }

    @Override
    public void esVolador() {

    }
}


