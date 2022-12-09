package Bimestre2_Semana1;

import java.util.Scanner;

public class Convertidor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribir 1 para convertir de MB a KB");
        System.out.println("Escribir 2 para convertir de KB a MB");
        System.out.println("Escribir 3 para convertir de MB a bits");
        System.out.println("Escribir 4 para finalizar");
        int opcion = teclado.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("De MB a KB");
                System.out.println("Ingrese el valor en MB: ");
                int valor_MB_1 = teclado.nextInt();
                int valor_KB_1 = valor_MB_1 * 1024;
                System.out.println(+valor_MB_1+ " MB, es igual a: "+valor_KB_1+" KB");
                break;

            case 2:
                System.out.println("De KB a MB");
                System.out.println("Ingrese el valor en KB: ");
                int valor_KB_2 = teclado.nextInt();
                int valor_MB_2 = valor_KB_2 /1024;
                System.out.println(valor_KB_2+" KB, es igual a: "+valor_MB_2+" MB");
                break;

            case 3:
                System.out.println("De MB a bits");
                System.out.println("Ingrese el valor de MB: ");
                int valor_MB_3 = teclado.nextInt();
                int valor_bytes = valor_MB_3 * 1024 * 1024;
                int valor_bits = valor_bytes * 8;
                System.out.println(+valor_MB_3+ " MB, es igual a: "+valor_bits+" bits");
                break;

            case 4:
                System.out.println("Salir");
                break;

        }
    }
}
