package BuscadorTexto;

import java.text.Normalizer;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
         //Pedir datos
        String texto = pedirTexto().toLowerCase();
        String palabra = pedirPalabra().toLowerCase();
        String palabraInvertida = String.valueOf(invertirPalabra(palabra));

        //Filtro de acentos para los datos
        String filtroTexto = filtroAcentos(texto);
        String filtroPalabra = filtroAcentos(palabra);
        String filtroPalabraInvertida = filtroAcentos(palabraInvertida);

        contadorPalabras(filtroTexto, filtroPalabra, filtroPalabraInvertida);


    }

    public static String pedirTexto(){
        System.out.println("Ingrese el texto para bucar");
        String texto=" ";
        Scanner teclado = new Scanner(System.in);
        texto = teclado.nextLine();
        return texto;
    }

    public static String pedirPalabra(){
        System.out.println("Ingrese la palabra que desea buscar");
        String palabra=" ";
        Scanner teclado = new Scanner(System.in);
        palabra = teclado.next();
        return palabra;
    }

    public static StringBuilder invertirPalabra(String conversion){

        String nornal = conversion;
        StringBuilder invertida = new StringBuilder();
        invertida.append(nornal);
        invertida.reverse();
        return invertida;
    }

    public static String contadorPalabras (String texto, String palabra, String invertida){

            String str = texto;
            String[] arrOfStr = str.split(" ");
        int i=0;
            for (String a : arrOfStr)
                if (a.equals(palabra) || a.equals(invertida)){
                i++;

                }else {
                }
        System.out.println("Cincidecnias en el texo " +i);
        return str;
    }
        //Filtro de acentos
    public static String filtroAcentos (String palabraFiltar){
        String original =  palabraFiltar;
        String cadenaNormalize = Normalizer.normalize(original, Normalizer.Form.NFD);
        String cadenaSinAcentos = cadenaNormalize.trim();//replaceAll("[^\\p{ASCII}]", "");

        return cadenaSinAcentos;
    }
}
