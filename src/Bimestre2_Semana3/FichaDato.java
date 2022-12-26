package Bimestre2_Semana3;

import java.util.Scanner;

public class FichaDato {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombres [] = new String[100];
        int edad [] = new int[100];
        String univ [] = new String[100];
        boolean interruptor = true;
        int indice = 0;
        while (interruptor){
            System.out.println("Ingrese datos del estudiante");
            System.out.println("Ingrese nombre: ");
            nombres [indice] = teclado.nextLine();
            System.out.println("Ingrese edad: ");
            edad [indice] = teclado.nextInt();
            teclado.nextLine(); // Sirve para leer el enter despúes de ingresar la edad
            System.out.println("Ingrese Universidad: ");
            univ[indice] = teclado.nextLine();
            indice++;
            System.out.println("Desea ingresar un nuevo estudiante si/no");
            String resp = teclado.nextLine().toLowerCase(); // en minúsculas
            if (resp.equals("no"))
                interruptor = false; // Finalizamos ciclo while
        }
        // Ordenar arreglo por edad
        System.out.println("Ordenar arreglo por edad: ");
        for (int indice2 = 1; indice2 <= edad.length-1; indice2++) {
            for (int elemento = 0; elemento <= edad.length-2; elemento++) {
                // Verificar si realizamos un intercambio
                if (edad [elemento] > edad[elemento+1]){
                    int aux = edad [elemento];
                    edad [elemento] = edad [elemento+1];
                    edad [elemento+1] = aux;
                    // Proceso de intercambio en arreglo nombres
                    String aux_n = nombres[elemento];
                    nombres [elemento] = nombres [elemento+1];
                    nombres [elemento+1] = aux_n;
                    // Proceso de intecambio en arreglo universidad
                    String aux_u = univ[elemento];
                    univ [elemento] = univ [elemento+1];
                    univ[elemento+1]=aux_u;
                }
            }
        }
        // Presentar datos de los estudiantes
        for (int pos = 0; pos < nombres.length; pos++) {
            if (nombres[pos] !=null) {
                System.out.println("Nombres: " + nombres[pos]);
                System.out.println("Edad: " + edad[pos]);
                System.out.println("Universidad: " + univ[pos]);
            }
        }
    }
}
