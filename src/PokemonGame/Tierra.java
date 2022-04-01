package PokemonGame;

public class Tierra extends Pokemon implements DebilContraPlante,DebilContraAgua{


    public Tierra(String nombre, String tipo, Integer vida, Integer ataque) {
        super(nombre, tipo, vida, ataque);
    }

    @Override
    public void debilContraPlanta(Planta atacante) {
        this.setVida(this.getVida()-2*atacante.ataque);
        System.out.println("La vida de "+this.nombre+" bajo a "+this.getVida());
    }
    @Override
    public void debilContraAgua(Agua atacante) {
        this.setVida(this.getVida()-2*atacante.ataque);
        System.out.println("La vida de "+this.nombre+" bajo a "+this.getVida());
    }
}
