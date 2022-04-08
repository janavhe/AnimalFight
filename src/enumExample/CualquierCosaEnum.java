package enumExample;

import PokemonGame.Pokemon;

import java.io.Serializable;

public enum CualquierCosaEnum implements Serializable {

    CUALQUIER_COSA_1(),
    CUALQUIER_COSA_2(),
    CUALQUIER_COSA_3(),;


    private Number numero;
    private String cadena;
    private  Pokemon pokemon;

    CualquierCosaEnum() {
    }

    CualquierCosaEnum(Number numero, String cadena, Pokemon pokemon) {
        this.numero = numero;
        this.cadena = cadena;
        this.pokemon = pokemon;
    }

    public Number getNumero() {
        return numero;
    }

    public void setNumero(Number numero) {
        this.numero = numero;
    }

    public String getCadena() {
        return cadena;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }

    public Pokemon getPokemon() {
        return pokemon;
    }

    public void setPokemon(Pokemon pokemon) {
        this.pokemon = pokemon;
    }

    @Override
    public String toString() {
        return "CualquierCosaEnum{" +
                "numero=" + numero +
                ", cadena='" + cadena + '\'' +
                ", pokemon=" + pokemon +
                '}';
    }
}
