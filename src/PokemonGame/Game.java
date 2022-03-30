package PokemonGame;

public class Game {
    public static void main(String[] args) {

        Fuego charizard = new Fuego("charizard","Fuego", 100,7);
        Bicho parasect = new Bicho("parasect","Bicho", 65,4);
        Planta vileplume = new Planta("vileplume","Planta Bicho", 65,4);
        Agua blastoise = new Agua("blastoise","Agua", 130,3);
        Hielo anintales = new Hielo("alola ninetiles","Hielo",70,8);
        Tierra marshtomp = new Tierra("marshtomp","Tierra",105,4);
        //System.out.println(charizard.getTipo() +" " +charizard.getVida() +" " + charizard.getNombre()+ " "+charizard.getAtaque());

        Entrenador Jazziel = new  Entrenador("Jazziel",charizard,parasect,vileplume,blastoise,anintales,marshtomp);

        charizard.pelea(parasect);
        vileplume.pelea(blastoise);
    }
}
