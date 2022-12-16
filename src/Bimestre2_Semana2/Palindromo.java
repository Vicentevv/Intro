package Bimestre2_Semana2;

import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la palabra para verificar si es PALINDROMA o no: ");
        String palabra = teclado.next();
        int tam_palabra = palabra.length();
        System.out.println("tam_palabra = " + tam_palabra);
        char palabra_arr[] = new char[tam_palabra];
        // Pasamos los caracteres de palabra al arreglo palabra_arr
        for (int indice = 0; indice < tam_palabra; indice++) {
            palabra_arr[indice] = palabra.charAt(indice); // .charAt () - Sirve para separar la palabra ingresada
        }
        // Lectura del arreglo de derecha a izquierda
        String palabra_invertida = "";
        for (int indice = tam_palabra-1; indice >= 0; indice--) {
            palabra_invertida = palabra_invertida + palabra_arr[indice];
        }
        // Determinamos si es palindromo o no
        if (palabra.equals(palabra_invertida)) {
            System.out.println("Si es palabra palíndroma");
        } else {
            System.out.println("No es una palabra palíndroma");
        }
    }
}
