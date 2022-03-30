package LuchaAnimal;

public class Paloma  extends Animal implements Volar{
    private  int TamanioPico;

    public Paloma() {
    }

    public Paloma(String especie, int vida, int danio, String raza, int TamanioPico) {
        super(especie, vida, danio, raza);
        this.TamanioPico=TamanioPico;
    }
    public void sonido(){
        System.out.println("cuack");
    }

    public int getTamanioPico() {
        return TamanioPico;
    }

    public void setTamanioPico(int tamanioPico) {
        TamanioPico = tamanioPico;
    }

    @Override
    public void Volar(String alas) {
        System.out.println("Vuela");
    }

}
