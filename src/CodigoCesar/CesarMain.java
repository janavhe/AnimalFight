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
//        String texto = fraseSinCodificar;
//        char[] ch = texto.toCharArray();
//        // 1.5N
//        for (int i = 0; i < ch.length; i++) {// 0.5
//            ch[i] = (char) ((char) ch[i] + n);// 0.5
//            System.out.print(ch[i]); //0.5
//        } return null;
        StringBuilder cifrado = new StringBuilder();
        int n = espacios % 26;

        for (int contador = 0; contador < fraseSinCodificar.length(); contador++) {
            if ((fraseSinCodificar.charAt(contador) + espacios) > 'z') {
                cifrado.append((char) (fraseSinCodificar.charAt(contador) + espacios - 26));
            } else {
                cifrado.append((char) (fraseSinCodificar.charAt(contador) + espacios));
            }

        }
        System.out.println(cifrado.toString());
        return cifrado.toString();
    }

    public static String decifradoCesar(String fraseSinCodificar, int espacios) {
//        String texto = fraseSinCodificar;
//        int n = espacios%26;
//        char[] ch = texto.toCharArray();
//        for (int i = 0; i < ch.length; i++) {
//            ch[i] = (char) ((char) ch[i] - n);
//            System.out.print(ch[i]);
//        } return null;

        StringBuilder cifrado = new StringBuilder();
        int n = espacios % 26;
        for (int contador = 0; contador < fraseSinCodificar.length(); contador++) {
            if ((fraseSinCodificar.charAt(contador) + espacios) > 'z') {
                cifrado.append((char) (fraseSinCodificar.charAt(contador) - espacios + 26));
            } else {
                cifrado.append((char) (fraseSinCodificar.charAt(contador) - espacios));
            }

        }
        System.out.println(cifrado.toString());
        return cifrado.toString();

    }
}
