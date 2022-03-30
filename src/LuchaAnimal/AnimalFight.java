package LuchaAnimal;

public class AnimalFight {
    public static void main(String[] args) {

        perro Doberman = new perro("Perro", 7,2,"Doberman");
        System.out.println(Doberman.getEspecie()+" danio: "+Doberman.getDanio()+ "  vida: " +Doberman.getVida());

        System.out.println("<--------------------------->");

        Gato Domestico = new Gato("Gato",5,3, "Domestico");
        System.out.println(Domestico.getEspecie()+" danio: "+Domestico.getDanio()+ "  vida: " + Domestico.getVida());

        System.out.println("<--------------------------->");

        Paloma Jacobina = new Paloma("Paloma",8,5,"Jacobina",12);
        System.out.println(Jacobina.getEspecie()+" danio: "+Jacobina.getDanio()+ "  vida: " + Jacobina.getVida());

        System.out.println("<--------------------------->");

        Rata Noruega = new Rata("Rata",4,2,"Callejera" );
        System.out.println(Noruega.getEspecie()+" danio: "+Noruega.getDanio()+ "  vida: " + Noruega.getVida());
        System.out.println("<--------------------------->");
        //Arañar arañar;
        //Batallas

        /*Doberman.HacerDanio(Jacobina);
        System.out.println("<--------------------------->");
        Jacobina.HacerDanio(Doberman);
        //Mover AnimalQueSeMueve = Domestico;*/

        Domestico.arañar(Jacobina);
        Domestico.arañar(Noruega);
        Domestico.dejarDevolar((x)->{System.out.println(x.toLowerCase());

        },"HOLA");

        Domestico.dejarDevolar((x)->{
            System.out.println(x.toLowerCase() +" Mundo");

        },"HOLA");


    }

}

