package estructura_for;

import java.util.Scanner;

public class SumaImpar {
    public static void main(String[] args) {
        System.out.println("Ingrese un número limite: ");
        Scanner teclado = new Scanner(System.in);
        int limite = teclado.nextInt();
        int suma_impar = 0;
        for (int contador = 1; contador <= limite; contador+= 2){
                suma_impar = suma_impar + contador;
        }
        System.out.println("La suma de números impares: "+suma_impar);
    }
}
