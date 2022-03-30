package LuchaAnimal;

public class Animal {

    //tipo de animal
    protected String especie;


    //raza (en caso de existir)
    protected String raza;

    //Vida
    protected int vida;

    //Danio
    protected int danio;

    public Animal() {
    }

    public Animal(String especie, int vida, int danio, String raza) {
        this.especie = especie;
        this.vida = vida;
        this.danio = danio;
        this.raza = especie;
    }



    //metodo

    public void HacerDanio(Animal animal2) {
        //Danio doble de Perro a gato
        if (this instanceof Arañar && animal2 instanceof Volar) {
           ((perro) this).hacerDanio((Gato) animal2);
    //Danio doble de gato a paloma
    }else if(this instanceof Gato &&  animal2 instanceof Paloma){//
            ((Gato)this).hacerDanio((Paloma) animal2);
        //Si no cumple ningun requisito
        }else {
            animal2.setVida(animal2.getVida() - this.danio);
            System.out.println(animal2.especie + " Recibir danio de " + this.especie + " .La vida de " + animal2.especie + " baja a " + animal2.getVida());
        }

    }

    public void dejarDevolar (Volar miObjetovolar, String objetoCadena){
        miObjetovolar.Volar(objetoCadena);
    }


    // getters

    public String getEspecie() {
        return especie;
    }

    public int getVida() {
        return vida;
    }

    public int getDanio() {
        return danio;
    }

    // setters

    public void setEspecie(String especie) {this.especie = especie;}

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setDanio(int danio) {this.danio = danio;    }

    public void setRaza(String raza) {
        this.raza = raza;
    }



    }

