package Bimestre2_Semana2;

import java.util.Scanner;

/**
 * Programa que solicite el nombre de n marcas de vehículos y las almacene en un arreglo
 * Finalmente el programa debe mostrar el nombre de las marcas en el arreglo
 */
public class ArregloMarca {
    public static void main(String[] args) {
        String marcas [];
        System.out.println("¿Cuántas marcas de vehículo va a ingresar?");
        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();
        teclado.nextLine();
        marcas = new String[n]; // Creamos el arreglo con n elementos
        for (int indice = 0; indice < n; indice++) {
            System.out.println("Ingrese el nombre de la marca: "+(indice+1));
            String marca = teclado.nextLine();
            marcas [indice] = marca;
        }
        System.out.println("Lista de marcas ingresadas: ");
        for (int indice = 0; indice < marcas.length; indice++) {
            System.out.println(marcas[indice]+"\t");
        }
        //Operación de busqueda
        System.out.println("¿Qué nombre de marca quiere buscar? ");
        // toUpperCase() es una función para convertir un texto en mayúsculas
        String marca_busqueda = teclado.nextLine().toUpperCase();
        System.out.println("marca_busqueda: " + marca_busqueda);
        for (int indice = 0; indice < n; indice++) {
            if (marca_busqueda.equals(marcas [indice])){
                System.out.println("Marca encontrada");
                System.out.println("Se encuentra en el indice: "+indice);
                break;
            }
        }

    }
}
