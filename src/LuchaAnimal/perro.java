package LuchaAnimal;

public class perro extends Animal implements Mover, Arañar {


    //Ventaja de tipo

    public perro() {
    }
    int garra;

    public perro(String especie, int vida, int danio, String raza) {
        super(especie, vida, danio, raza);
    }

    public void hacerDanio(Gato Animal2) {
        System.out.println("Golpe supereficaz");
        Animal2.setVida(Animal2.getVida() - 2*danio);
        System.out.println(Animal2.especie + " Recibir danio de " + this.especie + " .La vida de " + Animal2.especie + " baja a " + Animal2.getVida());
    }


    public void mover() {
        System.out.println("Moverse");
    }

     public void arañar (Gato dos){
         garra = this.danio+2;
         dos.setVida(dos.getVida() - garra);
         System.out.println(dos.especie + " Recibir danio de " + this.especie + " .La vida de " + dos.especie + " baja a " + dos.getVida());
     }

    public void arañar (Animal dos){
        System.out.println("El "+this.especie +" " +garra);
        dos.setVida(dos.getVida() - danio);
        System.out.println(dos.especie + " Recibir danio de " + this.especie + " .La vida de " + dos.especie + " baja a " + dos.getVida());
    }

}

