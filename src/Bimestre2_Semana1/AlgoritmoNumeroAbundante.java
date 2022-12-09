package Bimestre2_Semana1;

import java.util.Scanner;

public class AlgoritmoNumeroAbundante {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int numero = teclado.nextInt();
        int contador = 1;
        int suma_divisores = 0;
        while (contador < numero){
            if (numero % contador == 0){
                suma_divisores=suma_divisores+contador;
            }
            contador++;
        }
        if (suma_divisores>numero){
            System.out.println("Si es un numero abundante");
        }else{
            System.out.println("No es un numero abundante");
        }
    }
}
