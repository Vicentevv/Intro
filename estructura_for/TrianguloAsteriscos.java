package estructura_for;

import java.util.Scanner;

public class TrianguloAsteriscos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el número de filas: ");
        int filas = teclado.nextInt();
        //System.out.println("Ingre el número de columnas: ");
        //int columnas = teclado.nextInt();
        for (int fila= 1; fila<=filas; fila++){ //Controlamos numero de filas
            String fila_asterisco = "";
            for (int col= 1; col<= fila; col++){//Controlamos número de columnas
                fila_asterisco = fila_asterisco + " * ";
        }
            System.out.println(fila_asterisco);
        }
    }
}

