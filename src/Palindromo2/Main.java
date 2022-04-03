package Palindromo2;

import java.text.Normalizer;
import java.util.*;

public class Main {

    public static void main(String[] args) {

    String frase = pedirCadena().toLowerCase();
    String fraseIvertida = String.valueOf(invertirPalabra(frase));
    String fraseIvertidaFiltrada = filtroAcentos(frase);
    String fraseFiltrada = filtroAcentos(fraseIvertida);

    verificacion(fraseFiltrada, fraseIvertidaFiltrada);



    }
    //Ingresar la palabra con el teclado
    public static String pedirCadena(){
        System.out.println("Por favor ingresa una palabra para comprobar si es palindromo");
        Scanner frase = new Scanner(System.in);
        String palabra = " ";
        palabra = frase.nextLine();
        return palabra;
    }

    //Invertir la palabra
    public static StringBuilder invertirPalabra(String conversion){

        String nornal = conversion;

        StringBuilder invertida = new StringBuilder();

        invertida.append(nornal);

        invertida.reverse();

        return invertida;
    }

    //Comprobar si es un palindormo on o

    public static void verificacion (String normal, String invertida) {

        if(normal.equals(invertida)){
            System.out.println("La palabra es un palindromo");
        }else {
            System.out.println("La palabra NO es un palindromo");
        }
    }
    //Filtro de caracteres especiales
    public static String filtroAcentos (String palabraFiltar){
        String original =  palabraFiltar;
        String cadenaNormalize = Normalizer.normalize(original, Normalizer.Form.NFD);
        String cadenaSinAcentos = cadenaNormalize.replaceAll("[^\\p{ASCII}]", "");
        return cadenaSinAcentos;
    }


    }

