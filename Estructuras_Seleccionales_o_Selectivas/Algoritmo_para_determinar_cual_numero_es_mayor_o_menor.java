package Estructuras_Seleccionales_o_Selectivas;

import com.sun.source.tree.IfTree;

import java.util.Scanner;

public class Algoritmo_para_determinar_cual_numero_es_mayor_o_menor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Algoritmo para determinar cual número es mayor o menor");
        System.out.println("Ingrese el primer número: ");
        double num1 = teclado.nextByte();
        System.out.println("Ubgrese el segundo número: ");
        double num2 = teclado.nextByte();
        boolean mayor = (num1>num2);
        boolean menor = (num2>num1);
        if (mayor){
            System.out.println("El primer número es mayor");
        }if (menor) {
            System.out.println("El primer número es menor");
        } else {
            System.out.println("Valores ingresados incorrectos");
        }
    }
}
