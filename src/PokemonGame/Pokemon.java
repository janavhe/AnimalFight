package PokemonGame;

import java.io.*;

public class Pokemon implements Serializable {

    private static final long serialVersionUID = 1L;

    protected String nombre;
    protected String tipo;
    protected Integer vida;
    protected Integer ataque;
    protected Hielo hielo;

    public Pokemon() {
    }

    public Pokemon(String nombre, String tipo, Integer vida, Integer ataque, Hielo hielo) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.vida = vida;
        this.ataque = ataque;
        this.hielo = hielo;
    }

    public Pokemon(String nombre, String tipo, Integer vida, Integer ataque) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.vida = vida;
        this.ataque = ataque;
    }


    public Pokemon(Pokemon datosDelArchivo) {

    }


    public void pelea(Pokemon defensor) {
        if (defensor instanceof Bicho && this instanceof Fuego) {
            ((Bicho) defensor).debilContraFuego((Fuego) this);
        } else if (defensor instanceof Planta && this instanceof Fuego) {
            ((Planta) defensor).debilContraFuego((Fuego) this);
        } else if (defensor instanceof Fuego && this instanceof Agua) {
            ((Fuego) defensor).debilContraAgua((Agua) this);
        } else if (defensor instanceof Agua && this instanceof Planta) {
            ((Agua) defensor).debilContraPlanta((Planta) this);
        } else {
            defensor.setVida(defensor.getVida() - this.ataque);
            System.out.println("La vida de " + defensor.nombre + " bajo a " + defensor.getVida());
        }

    }


    //setter and getters


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getVida() {
        return vida;
    }

    public void setVida(Integer vida) {
        this.vida = vida;
    }

    public Integer getAtaque() {
        return ataque;
    }

    public void setAtaque(Integer ataque) {
        this.ataque = ataque;
    }

    public Hielo getHielo() { return hielo; }

    public void setHielo(Hielo hielo) { this.hielo = hielo; }




    @Override
    public String toString() {
        return "Pokemon{" +
                "nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                ", vida=" + vida +
                ", ataque=" + ataque +
                ", hielo=" + hielo +
                '}';
    }

   
}

