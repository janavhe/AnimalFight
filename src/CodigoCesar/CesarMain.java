package CodigoCesar;

import java.util.Scanner;

public class CesarMain {
    public static void main(String[] args) {

        int eleccion = eleccion();

       switch (eleccion) {
           case 1:
               String textoCodificar = pedirtexto().toLowerCase();
               int espaciosMover = pedirEspacios();
               cifradoCesar(textoCodificar, espaciosMover);
               break;

           case 2:
           String textoDecodificar = pedirtexto().toLowerCase();
           int espaciosMover2 = pedirEspacios();
           decifradoCesar(textoDecodificar, espaciosMover2);
            break;

           default:
               System.out.println("Eleccion incorrecta");
        }
    }


    public static String pedirtexto (){
        System.out.println("Ingrese el texto a codificar o decodificar");
        Scanner tecladoTexto = new Scanner(System.in);
        String texto = " ";
        texto = tecladoTexto.nextLine();

        return  texto;
    }

    public static int pedirEspacios (){

        System.out.println("Ingrese el numero de palasbras a recorrer");
        Scanner numeroRecorrer = new Scanner(System.in);
        int recorrer = 0;
        recorrer = numeroRecorrer.nextInt();
        return recorrer;
    }

    public static int eleccion (){

        System.out.println("Ingrese que desea hacer");
        System.out.println("1. COdificar texto \n\n2. Decodificar texto");
        System.out.println("-----------------------------");
        Scanner numeroRecorrer = new Scanner(System.in);
        int eleccion = 0;
        eleccion = numeroRecorrer.nextInt();
        return eleccion;
    }

    public static String cifradoCesar(String fraseSinCodificar, int espacios) {
        String texto = fraseSinCodificar;
        int n = espacios;
        char[] ch = texto.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            ch[i] = (char) ((char) ch[i] + n);
            System.out.print(ch[i]);
        } return null;
    }

    public static String decifradoCesar(String fraseSinCodificar, int espacios) {
        String texto = fraseSinCodificar;
        int n = espacios;
        char[] ch = texto.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            ch[i] = (char) ((char) ch[i] - n);
            System.out.print(ch[i]);
        } return null;
    }
}
