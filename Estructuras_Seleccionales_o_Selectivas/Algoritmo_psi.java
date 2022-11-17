package Estructuras_Seleccionales_o_Selectivas;

import java.util.Scanner;

public class Algoritmo_psi {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Algoritmo para calcular el valor de la presion en libras por pulgada (psi)");
        System.out.println("Ingresar tiempo: ");
        int x = teclado.nextInt();
        boolean s1 = (x<=35);
        boolean s2 = (x>35);
        double psi= (0.46*x);
        if (s1){
            psi = 0.46*x;
            System.out.println("La presión es correcta: "+psi);
        } else if (s2) {
            psi=(0.19*x)+9.45;
            System.out.println("La presion esta bien: "+psi);
        }else{
            System.out.println("INCORRECTO");
        }

    }
}

