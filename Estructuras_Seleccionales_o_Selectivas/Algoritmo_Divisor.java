package Estructuras_Seleccionales_o_Selectivas;

import java.net.ServerSocket;
import java.util.Scanner;

public class Algoritmo_Divisor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Algoritmo para determinar si dos números son divisores");
        System.out.println("Ingrese el primer valor: ");
        int a = teclado.nextInt();
        System.out.println("Ingrese el segundo valor: ");
        int b = teclado.nextInt();

        boolean divisor2 = (b%a==0);
        boolean divisor = (a%b==0);
        if (divisor) {
            System.out.println(b +" si es divisor de "+a);
        } else {
            if (divisor2) {
                System.out.println(a +" si es divisor de "+b);
            } else{
                System.out.println("No son divisores entre si");
            }
    }
}
}
