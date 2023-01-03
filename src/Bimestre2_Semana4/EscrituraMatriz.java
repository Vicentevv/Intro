package Bimestre2_Semana4;

import java.util.Scanner;

public class EscrituraMatriz {
    public static void main(String[] args) {
        int numeros [][] = new int [3][2];
        int filas = numeros.length;
        int columnas = numeros[0].length;
        numeros[1][1] = 5;
        numeros[2][0] = 9;
        // Operación escritura de una matriz
        Scanner teclado = new Scanner(System.in);
        for (int fila = 0; fila < filas ; fila++) {
            System.out.println("Fila: " + fila);
            for (int colum = 0; colum < columnas ; colum++) {
                System.out.println("Ingrese una edad: para numeros ["+fila+"]["+colum+"]: ");
                int edad = teclado.nextInt();
                numeros[fila][colum] = edad;
            }
            System.out.print("\n");
        }
        // Operación lectura de una matriz
        for (int fila = 0; fila < filas ; fila++) {
            for (int colum = 0; colum < columnas ; colum++) {
                System.out.print(numeros[fila][colum] + "\t");
            }
            System.out.println("\n");
        }
    }
}
