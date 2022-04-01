package PokemonGame;

public class Agua extends Pokemon implements DebilContraPlante{
    

    public Agua(String nombre, String tipo, Integer vida, Integer ataque) {
        super(nombre, tipo, vida, ataque);
    }



    @Override
    public void debilContraPlanta(Planta atacante) {
        this.setVida(this.getVida()-2*atacante.ataque);
        System.out.println("La vida de "+this.nombre+" bajo a "+this.getVida());
    }
}