package enumExample;

import java.io.Serializable;

public enum ArchivosEnum implements Serializable {

    ARCHIVO_DANIEL("/Users/danielmora/hola2.txt"),
    ARCHIVO_JAZZIEL("D:/Prueba/salidaDePokemon.txt");


    private String rutaDeArchivo;


    ArchivosEnum(String rutaDeArchivo) {
        this.rutaDeArchivo = rutaDeArchivo;
    }

    public String getRutaDeArchivo() {
        return rutaDeArchivo;
    }

    public void setRutaDeArchivo(String rutaDeArchivo) {
        this.rutaDeArchivo = rutaDeArchivo;
    }

    @Override
    public String toString() {
        return "ArchivosEnum{" +
                "rutaDeArchivo='" + rutaDeArchivo + '\'' +
                '}';
    }
}
