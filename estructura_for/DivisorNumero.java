package estructura_for;

import java.util.Scanner;

public class DivisorNumero {
    public static void main(String[] args) {
        System.out.println("Ingrese un valor: ");
        Scanner teclado = new Scanner(System.in);
        int valor = teclado.nextInt();
        for (int contador = 1; contador<=valor; contador++){
            if (valor%contador == 0)
                System.out.println("Los divisores son: " +contador);
        }
    }
}
