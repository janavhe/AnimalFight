package TareaStream;
import java.util.*;
import static java.lang.System.*;

public class StreamMain {
    public static void main(String[] args) {

        Random rand = new Random(); //instance of random class

        List<Integer> randNumber = new ArrayList<Integer>();

        while (randNumber.size() < 50) { //
            int a = rand.nextInt(199) + 1; //
            if (!randNumber.contains(a)) {
                randNumber.add(a);
            }
        }

        //Imprimir el valor de la lista
        randNumber.stream().forEach(value->{
            System.out.println(value);
        });
        out.println("-----------Imprimir String------------");
        //Imprimir String
        randNumber.stream().map(value -> value.toString()).forEach(x -> {
            out.println(x);
        });
        out.println("-----------Primos------------");
        //Buscar numeros primos.
        randNumber.stream().map(value -> {return value;}).filter(x-> x%2 != 0 ).forEach(out::println);

        out.println("-------------Pares-----------");
        //Buscar numeros pares.
        randNumber.stream().map(value -> {return value;}).filter(x-> x%2 == 0 ).forEach(out::println);

        out.println("-------------Multiplos 7-----------");
        //Buscar multiplos de 7.
        randNumber.stream().map(value -> {return value;}).filter(x-> x%7 == 0 ).forEach(out::println);

        out.println("-------------Ascendente-----------");
        //Ordenar de manere ascencente .
        randNumber.stream().map(value -> {return value;}).sorted().forEach(out::println);

        out.println("-------------Decendente-----------");
        //Ordenar de manere descendente .
        randNumber.stream().map(value -> {return value;}).sorted(Comparator.comparing(Integer::intValue).reversed()).forEach(out::println);

        out.println("-------------Contar Numeros Primos-----------");
        //Contar numeros primos .
        out.println(randNumber.stream().map(value -> {return value;}).filter(x-> x%2 != 0).count());

        out.println("-------------Multiplicar todos los numeros-----------");
        //Multiplicar todos los numeros
        out.println(randNumber.stream().map(value -> {return value;}).reduce((acumulador,iterador)->{return (acumulador*iterador);}));

        out.println("-------------Mas grande-----------");
        //valor mas alto
        out.println(randNumber.stream().map(value -> {return value;}).max((x,y)-> x.compareTo(y)));

        out.println("-------------Promedio-----------");
        //Promedio
        out.println(randNumber.stream().mapToDouble(value -> {return value;}).average());

    }
}