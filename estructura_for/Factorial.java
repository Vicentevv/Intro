package estructura_for;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Ingrese un valor: ");
        Scanner teclado = new Scanner(System.in);
        int valor = teclado.nextInt();
        int acumulador = 1;
        for (int contador = 1; contador<=valor; contador++){
            acumulador=acumulador+contador;
        }
        System.out.println("Los valores Factoriales son: "+acumulador);
    }

}
