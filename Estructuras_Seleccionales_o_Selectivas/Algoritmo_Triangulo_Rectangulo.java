package Estructuras_Seleccionales_o_Selectivas;

import java.util.Scanner;

public class Algoritmo_Triangulo_Rectangulo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Algoritmo para determinar si tres números enteros pueden ser las medidas de los lados de un triángulo rectángulo");
        System.out.println("Ingrese el valor del cateto adyacente: ");
        double x = teclado.nextDouble();
        System.out.println("Ingrese el valor del cateto opuesto ");
        double y = teclado.nextDouble();
        System.out.println("Ingrese el valor de la hipotenusa");
        double h = teclado.nextDouble();
        boolean triangulo = ((Math.pow(2, x)+Math.pow(2, y))==(Math.pow(2,h)));
        if (triangulo) {
            System.out.println("Es un Triangulo Rectángulo");
        } else {
            System.out.println("No es un triángulo rectángulo.");
        }
    }
}


