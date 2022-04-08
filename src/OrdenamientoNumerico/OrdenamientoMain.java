package OrdenamientoNumerico;

import java.util.Arrays;
import java.util.Scanner;

public class OrdenamientoMain {

    public static void main(String[] args) {
        int cuantosNumeros = cantidadNumeros();
       ordenaNumeros(cuantosNumeros);


}

    public static int cantidadNumeros(){
        int numeros = 0;
        System.out.println("Ingrese cuantos numeros quiere ordenar");
        Scanner teclado = new Scanner(System.in);
        numeros = teclado.nextInt();

        return numeros;
    }

    public static void ordenaNumeros(int cabtidadNumeros){
        int [] numbers = new int[cabtidadNumeros];

        for (int i = 0; i < numbers.length; i++)
        {
            System.out.println("Please enter number");
            Scanner input = new Scanner(System.in);
            numbers[i] = input.nextInt();
        }
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

    }
}

