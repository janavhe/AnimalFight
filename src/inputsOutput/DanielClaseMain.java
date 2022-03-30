package inputsOutput;

import PokemonGame.Fuego;
import PokemonGame.Pokemon;

import java.io.*;
import java.util.Scanner;

public class DanielClaseMain {
    public static void main(String[] args) {

        String lecturaDelTeclado = leerDelReclado();
        String lecturaDelArchivo = leerDeArchivo("/Users/danielmora/hola.txt");

        escribirEnArchivo("/Users/danielmora/holaSalidaTeclado.txt", lecturaDelTeclado);
        escribirEnArchivo("/Users/danielmora/holaSalidaArchivo.txt", lecturaDelArchivo);


        escribirEnArchivo("/Users/danielmora/salidaDePokemon.txt",charizard);

        Pokemon pokemonDeArchivo = lecturaDelArchivoPokemon("archivoDeDaniel");



    }



    public static String leerDelReclado(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Ingresa una cadena");
        String cadenaFinal = "";

        cadenaFinal += keyboard.nextLine();
        System.out.println(cadenaFinal);
        return cadenaFinal;
    }


    public static void escribirEnArchivo(String nombreDeArchivo, String cadenaEscritura){
        File archivo = new File(nombreDeArchivo);
        File archivoValidado = abrirArchivo(archivo);
        if (archivoValidado != null){
            escribirEnArchivoLosBytes(archivoValidado,cadenaEscritura);
        }else {
            System.out.println("Objeto nulo");
        }

    }


    public static void escribirEnArchivo(String nombreDeArchivo, Pokemon cadenaEscritura){
        File archivo = new File(nombreDeArchivo);
        File archivoValidado = abrirArchivo(archivo);
        if (archivoValidado != null){
            escribirEnArchivoLosBytes(archivoValidado,cadenaEscritura);
        }else {
            System.out.println("Objeto nulo");
        }

    }


    public static String leerDeArchivo(String nombreDeArchivo){
        File archivo = new File(nombreDeArchivo);
        File archivoValidado = abrirArchivo(archivo);
        if (archivoValidado != null){
            return leerEnArchivoLosBytes(archivoValidado);
        }else {
            System.out.println("Archivo sin datos");
            return "Sin Datos";
        }

    }


    private static void escribirEnArchivoLosBytes(File archivo, Pokemon pokemon) {
        try {
            FileOutputStream flujoSalidaArchivo = new FileOutputStream(archivo);
            ObjectOutputStream objetoStream = new ObjectOutputStream(flujoSalidaArchivo);
            objetoStream.writeObject(pokemon);
        } catch (FileNotFoundException e) {
            System.out.println("No se encontro el archivo");
        } catch (IOException e) {
            System.out.println("No se pudo escribir en el archivo");
        }
    }
    private static void escribirEnArchivoLosBytes(File archivo, String cadena) {
        try {
            FileOutputStream flujoSalidaArchivo = new FileOutputStream(archivo);
            flujoSalidaArchivo.write(cadena.getBytes());
        } catch (FileNotFoundException e) {
            System.out.println("No se encontro el archivo");
        } catch (IOException e) {
            System.out.println("No se pudo escribir en el archivo");
        }
    }

    private static String leerEnArchivoLosBytes(File archivo) {
        String cadenaDeLectura = "";
        try {
            FileInputStream flujoEntradaArchivo = new FileInputStream(archivo);
            byte[] datosDelArchivo =  flujoEntradaArchivo.readAllBytes();
            cadenaDeLectura = new String(datosDelArchivo);
        } catch (FileNotFoundException e) {
            System.out.println("No se encontro el archivo");
        } catch (IOException e) {
            System.out.println("No se pudo escribir en el archivo");
        }
        return cadenaDeLectura;
    }


    private static File abrirArchivo(File archivo) {
        try {
            archivo.createNewFile();
            if (archivo.canWrite()){
                return archivo;
            }else {
                System.out.println("No se puede escribir, por que es una carpeta.");
            }
        } catch (IOException e) {
            System.out.println("Error al crear archivo.");
        }
        return null;
    }
}
