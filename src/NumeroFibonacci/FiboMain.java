package NumeroFibonacci;

import java.util.Scanner;

public class FiboMain {

    public static void main(String[] args) {
        int numerFibo = pedirNUmero();

        //numeroFibonacci(numerFibo);

        System.out.println(fibonacciRecursiva(numerFibo));
    }


    public  static int pedirNUmero (){
        System.out.print("ingrese un nunero: ");

        Scanner teclado = new Scanner(System.in);
        int numero = teclado.nextInt();
        return numero;
    }

    public static int numeroFibonacci (int numeroFinal){
//        int numeroFibo = numeroInicio;
        int i=0;
        int Fx0=0;
        int Fx1=1;
        int Fxn=0;
        do{
            i++;
            Fx0=Fx1;
            Fx1=Fxn;
            Fxn = Fx0+Fx1;
        }while (i<+numeroFinal);
        System.out.println("------------------------------------------");
        System.out.println("El "+i +"° numero de Fibonacci es " +Fxn);
        System.out.println("------------------------------------------");
        return Fxn;
    }

    public static int fibonacciRecursiva (int numero){
        if (numero ==  0){return 0;}
        else if( numero == 1){return  1;}
        else {return fibonacciRecursiva(numero-1)+fibonacciRecursiva(numero-2);}

    }
}
