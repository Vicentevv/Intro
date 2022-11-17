package Estructuras_Seleccionales_o_Selectivas;

import java.util.Scanner;

public class Algoritmo_para_calcular_dias_horas_minutos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Algoritmo para calcular el tiempo de minutos a su equivalencia en días horas y minutos");
        System.out.println("Ingrese los minutos: ");
        int t = teclado.nextInt();
        int dias = 0;
        int horas = 0;
        int minutos = 0;
        while (t > 0) {
            if (t >= 1140) {
                dias = (dias + 1);
                t = (t - 1140);
            } else if (t >= 60){
                horas = (horas + 1);
                t = (t - 60);
            } else {
                minutos = (minutos + 1);
                t = (t - 1);

            }
        }
        System.out.println("Es igual a " + dias + " dias, " +horas+" horas y " + minutos +" minutos.");
    }
}
