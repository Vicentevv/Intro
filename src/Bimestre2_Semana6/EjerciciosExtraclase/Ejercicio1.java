package Bimestre2_Semana6.EjerciciosExtraclase;

import java.util.Scanner;

public class Ejercicio1 {
    static double saldo = 0; //Variable global para almacenar el saldo de la cuenta

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese el saldo inicial de la cuenta: ");
        saldo = teclado.nextDouble(); //Se asigna el saldo ingresado por el usuario

        int opcion = 0;
        do {
            System.out.println("1. Consulta de saldo");
            System.out.println("2. Retirar dinero");
            System.out.println("3. Depositar dinero");
            System.out.println("4. Salir del programa");
            System.out.print("Ingrese una opción: ");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    consultaSaldo(); //Llama al método para mostrar el saldo actual
                    break;
                case 2:
                    retirarDinero(); //Llama al método para retirar dinero de la cuenta
                    break;
                case 3:
                    depositarDinero(); //Llama al método para depositar dinero en la cuenta
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida, intente de nuevo.");
            }
        } while (opcion != 4);
    }

    //Método para mostrar el saldo actual
    public static void consultaSaldo() {
        System.out.println("Saldo actual: $" + saldo);
    }

    //Método para retirar dinero de la cuenta
    public static void retirarDinero() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de dinero a retirar: $");
        double retirar = teclado.nextDouble();
        if (retirar > saldo) {
            System.out.println("Saldo insuficiente para realizar esta operación.");
        } else {
            saldo -= retirar; //Se resta la cantidad retirada al saldo actual
            System.out.println("Dinero retirado exitosamente. Nuevo saldo: $" + saldo);
        }
    }

    //Método para depositar dinero en la cuenta
    public static void depositarDinero() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de dinero a depositar: $");
        double depositar = teclado.nextDouble();
        saldo += depositar;
    }
}