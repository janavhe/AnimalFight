package PokemonGame2;

public class Pokemon  {

        protected String nombre;
        protected String tipo;
        protected Tipo tipoDos;
        protected Integer vida;
        protected Integer ataque;

    public Pokemon() {
    }

    public Pokemon(String nombre, String tipo, Tipo tipoDos, Integer vida, Integer ataque) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.tipoDos = tipoDos;
        this.vida = vida;
        this.ataque = ataque;
    }

    //Metodos


    //Getter && Setters


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

    public Tipo getTipoDos() {
        return tipoDos;
    }

    public void setTipoDos(Tipo tipoDos) {
        this.tipoDos = tipoDos;
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
}