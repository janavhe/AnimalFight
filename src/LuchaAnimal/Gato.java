package LuchaAnimal;

public class Gato extends Animal implements Mover{

    public Gato() {
    }
    int garra;

    public Gato(String especie, int vida, int danio, String raza) {
        super(especie, vida, danio, raza);
    }


    public void hacerDanio(Paloma Animal2) {
        System.out.println("Golpe supereficaz");
        Animal2.setVida(Animal2.getVida() - 2*this.danio);
        System.out.println(Animal2.especie + " Recibir danio de " + this.especie + " .La vida de " + Animal2.especie + " baja a " + Animal2.getVida());
    }

    @Override
    public void mover() {
        System.out.println("Moverse");
    }

    public void arañar (Paloma dos ){
        garra = this.danio+2;
        dos.setVida(dos.getVida() - garra);
        System.out.println(dos.especie + " Recibir danio de " + this.especie + " .La vida de " + dos.especie + " baja a " + dos.getVida());
    }

    public void arañar (Rata dos ) {
        garra = this.danio + 2;
        dos.setVida(dos.getVida() - garra);
        System.out.println(dos.especie + " Recibir danio de " + this.especie + " .La vida de " + dos.especie + " baja a " + dos.getVida());
    }

    public void arañar (Animal dos){
        System.out.println("El "+this.especie +" " +garra);
        dos.setVida(dos.getVida() - danio);
        System.out.println(dos.especie + " Recibir danio de " + this.especie + " .La vida de " + dos.especie + " baja a " + dos.getVida());
    }


}
