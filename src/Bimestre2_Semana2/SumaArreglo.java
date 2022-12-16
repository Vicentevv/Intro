package Bimestre2_Semana2;

import java.util.Scanner;

public class SumaArreglo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de números a sumar: ");
        int num_sum = teclado.nextInt();
        int arreglo1 [] = new int[num_sum];
        int arreglo2 [] = new int[num_sum];
        System.out.println("Ingrese la primera cantidad de números: ");
        for (int indice = 0; indice < num_sum; indice++) {
            int num1 = teclado.nextInt();
            arreglo1[indice] = num1;
            System.out.print("\t");
        }
        System.out.println("Ingrese la segunda cantidad de números: ");
        for (int indice = 0; indice < num_sum; indice++) {
            int num2 = teclado.nextInt();
            arreglo2 [indice] = num2;
            System.out.print("\t");
        }
        int suma[] = new int[num_sum];
        int suma2[] = new int[num_sum];
        int sumar[] = new int[num_sum];
        for (int indice = 0; indice < num_sum; indice++) {
            sumar[indice] = arreglo1[indice] + arreglo2[indice];
        }
        System.out.println("La respuesta es: ");
        for (int indice = 0; indice < num_sum; indice++) {
            System.out.print(sumar[indice]+ "\t");

        }
    }
}
