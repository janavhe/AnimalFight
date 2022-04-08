package RecursividadArchivos2;

import java.io.File;

public class RecursividadArchivosMain {
    public static void main(String[] args) {

        File arcivoInicio = new File("D:\\Descargas");
        bucarEnArchivo(arcivoInicio);

    }

    public static void bucarEnArchivo (File arcivoInicio){

        if (arcivoInicio.isFile()){
            System.out.println("Mi ruta es " +arcivoInicio.getParent()+ " yo me llamo " +arcivoInicio.getName());
        }
        else {
                for (File file : arcivoInicio.listFiles()) {
                    bucarEnArchivo(file);

                }
            }
        }
    }

