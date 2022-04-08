package inputsOutput;

import PokemonGame.Hielo;
import PokemonGame.Pokemon;
import enumExample.ArchivosEnum;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.*;
import java.util.Scanner;
import java.util.stream.IntStream;

public class DanielClaseMain {
    public static void main(String[] args) throws IOException, UnsupportedFlavorException {

//
//        Pokemon charizard = new Pokemon("charizard","Fuego", 120,7,new Hielo("Ninetales","Hielo",120,50));
//        Pokemon charmander = new Pokemon("charizard","Fuego", 120,7,new Hielo("Ninetales","Hielo",120,50));
//        Pokemon charmilion = new Pokemon("charizard","Fuego", 120,7,new Hielo("Ninetales","Hielo",120,50));
//
////        String lecturaDelTeclado = leerDelTeclado();
////        String lecturaDelArchivo = leerDeArchivo("D:/Prueba/hola.txt");
////
////        escribirEnArchivo("D:/Prueba/holaSalidaTeclado.txt", lecturaDelTeclado);
////        escribirEnArchivo("D:/Prueba/holaSalidaArchivo.txt", lecturaDelArchivo);
//        escribirEnArchivo(ArchivosEnum.ARCHIVO_DANIEL.getRutaDeArchivo(), charizard);
//
//        escribirEnArchivo(ArchivosEnum.ARCHIVO_JAZZIEL.getRutaDeArchivo(), charizard);
//
//
//        Pokemon lecturaDelPokemon = leerDeArchivoObjeto ("D:\\Prueba\\salidaDePokemon.txt");
//        System.out.println(lecturaDelPokemon);


        String cadenaFromClipboard = getFromClipBoard();
        System.out.println(cadenaFromClipboard);

        cadenaFromClipboard = cadenaFromClipboard + " Modificada desde java gg salu2";
        putFromClipBoard(cadenaFromClipboard);


        int suma = 0;
        for (int i = 0; i < 100;i++){
            if (i % 2 == 0){
                suma+=i;
                //COneccion de datos
                //Mandar mensajes a celular
                //Mandar una oprden a amazon
            }
        }
        System.out.println(suma);




    }


    public static String leerDelTeclado(){
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

    public static Pokemon leerDeArchivoObjeto(String nombreDeArchivo){
        File archivo = new File(nombreDeArchivo);
        File archivoValidado = abrirArchivo(archivo);
        if (archivoValidado != null){
            return leerEnArchivoObjeto(archivoValidado);
        }else {
            System.out.println("Archivo sin datos");
            return null;
        }
    }



    private static void escribirEnArchivoLosBytes(File archivo, Pokemon pokemon) {
        try {
            FileOutputStream flujoSalidaArchivo = new FileOutputStream(archivo);
            ObjectOutputStream objetoStream = new ObjectOutputStream(flujoSalidaArchivo);
            System.out.println(pokemon);
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
            System.out.println("No se pudo leer el archivo");
        }
        return cadenaDeLectura;
    }

        private static Pokemon leerEnArchivoObjeto(File archivo) {
        Pokemon cadenaDeLectura = null;
        try {
            FileInputStream flujoEntradaArchivo = new FileInputStream(archivo);
            ObjectInputStream objetoStream = new ObjectInputStream(flujoEntradaArchivo);
            Pokemon datosDelArchivo = (Pokemon) objetoStream.readObject();
            cadenaDeLectura = new Pokemon(datosDelArchivo);
        } catch (FileNotFoundException e) {
            System.out.println("No se encontro el archivo Pokemon");
        } catch (IOException e) {
            System.out.println("No se pudo leer el archivo Pokemon");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
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


    public static String getFromClipBoard() throws IOException, UnsupportedFlavorException {
        String data = (String) Toolkit.getDefaultToolkit()
                .getSystemClipboard().getData(DataFlavor.stringFlavor);
        return data;
    }

    public static void putFromClipBoard(String text) throws IOException, UnsupportedFlavorException{

        StringSelection stringSelection = new StringSelection(text);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, null);
    }

}

