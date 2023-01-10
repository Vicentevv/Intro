package Bimestre2_Semana5;

import java.util.Scanner;

public class ClaseConMetodoConRetornoValor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("PROGRAMA PARA SUMAR DOS NÚMEROS");
        System.out.println("Ingrese el primer número: ");
        int num1 = teclado.nextInt();
        System.out.println("Ingrese el segundo número: ");
        int num2 = teclado.nextInt();
        int resultado = sumar (5,6); // Llamamos al método y recibimos el valor
        System.out.println("La suma es: " +resultado);
        sumar_dos_numeros(num1, num2);
        //Obterner el promedio de los números ingresados
        double promedio = obtener_promedio(resultado,2);
        System.out.println("El promedio de los números es: "+promedio);
    }

    /**
     * Este método realiza la suma de dos números enteros
     * @param n1
     * @param n2
     * @return resultado
     */
    public static int sumar(int n1, int n2) {
        int resultado = n1 + n2;
        return n1;
    }

    public static void sumar_dos_numeros(int n1, int n2) {
        int resultado = n1 + n2;
        System.out.println("La suma de los números es: " +resultado);
    }

    /**
     * Método para obtener el promedio de una suma de valores
     *
     * @param suma_total
     * @param cantidad_num
     * @return
     */
    public static double obtener_promedio(int suma_total, int cantidad_num){
        double promedio = (double) suma_total/(double) cantidad_num;
        return promedio;
    }


}
