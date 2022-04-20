package stream;

import java.util.Arrays;
import java.util.List;

public class StreamEjemeplos {


    public static void main(String[] args) {
        List<Usuario> listaUsuario = Arrays.asList(new Usuario("Alan"), new Usuario("Memo"), new Usuario("Zala"));


        //Itera los elementos del flujo
        listaUsuario.stream()
                .forEach(y ->
                        {
                            System.out.println(y.getUserName());
                        }
                );


        System.out.println("------------");
        //Cambiar la clase del flujo de datos
        listaUsuario.stream()
                .map(z ->
                        {
                            return z.getUserName();
                        }
                )
                .forEach(x -> {
                            System.out.println(x);
                        }
                );


        System.out.println("------------");
        //Filtrabamos
        listaUsuario.stream()
                .map(z ->
                        {
                            return z.getUserName();
                        }
                ).filter(x -> {
                    return x.contains("o");
                })
                .forEach(x -> {
                            System.out.println(x);
                        }
                );

        System.out.println("------------");

        //Buscamos un elemento que coincida con el filtro
        System.out.println(
                listaUsuario.stream()
                        .map(z ->
                                {
                                    return z.getUserName();
                                }
                        )
                        .filter(x -> {
                            return x.contains("b");
                        })
                        .findAny()
                        .orElse("Valor por defecto")

        );
        System.out.println("------------");
        //Contamos
        System.out.println(listaUsuario.stream().count());
        System.out.println("------------");

        //Contamos si cumple con un filtro
        System.out.println(listaUsuario.stream()
                .map(z ->
                        {
                            return z.getUserName();
                        }
                ).filter(x -> {
                    return x.contains("a");
                }).count());

        System.out.println("------------");

        //Reducimos la lista a un solo elemento
        System.out.println(listaUsuario.stream()
                .map(z ->
                        {
                            return z.getUserName();
                        }
                ).reduce(  (acumulador, iterador)->{
                            return acumulador + iterador;
                        }
                ).orElse("No se pudo reducir"));;


    }
}
