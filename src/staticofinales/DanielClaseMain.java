package staticofinales;

import PokemonGame.Hielo;
import PokemonGame.Pokemon;
import enumExample.ArchivosEnum;

import java.io.*;
import java.util.Scanner;

public class DanielClaseMain {
    public static void main(String[] args) {


        Pokemon charmander = new Pokemon("charizard","Fuego", 120,7,new Hielo("Ninetales","Hielo",120,50));
        Pokemon charmilion = new Pokemon("charizard","Fuego", 120,7,new Hielo("Ninetales","Hielo",120,50));
        Pokemon charizard = new Pokemon("charizard","Fuego", 120,7,new Hielo("Ninetales","Hielo",120,50));



        System.out.println(charizard.getTipo());





    }


}

