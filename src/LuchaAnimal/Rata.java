package LuchaAnimal;

public class Rata extends Animal implements Arañar{

    public Rata() {
    }

    public Rata(String especie, int vida, int danio, String raza) {
        super(especie, vida, danio, raza);
    }

    @Override
    public void arañar(Animal dos) {

    }
}
