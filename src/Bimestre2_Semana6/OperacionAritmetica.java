package Bimestre2_Semana6;

import java.util.Scanner;

/**
 * programa para crear metodos para realizar operaciones aritmeticas
 */
public class OperacionAritmetica{
    //creacion de variables globales
    int n1;
    int n2;

    /**
     * Metodo para realizar la suma de dos numeros enteros
     * @param n1
     * @param n2
     * @return n1 + n2
     */

    public int sumar (int n1, int n2){
        return (n1 + n2);
    }

    /**
     * RESTAR
     * @param n1
     * @param n2
     * @return
     */
    public int restar (int n1, int n2){
        return (n1 - n2);
    }

    /**
     * MULTIPLICAR
     * @param n1
     * @param n2
     */
    public void multiplicar (int n1, int n2){
        System.out.println("La multiplicaacion es: "+(n1+n2));
    }
    public void dividir(int n1, int n2) {
        if (n2 > 0) {
            System.out.println("La division es: " + ((double) n1 / (double) n2));
        } else {
            System.out.println("División por cero no existe");
        }
    }

    public void ejecutar(){
        Scanner teclado = new Scanner(System.in);
        boolean interruptor = true;
        while(interruptor){
            System.out.println("Dígite 0, para SALIR");
            System.out.println("Dígite 1, para sumar 2 números");
            System.out.println("Dígite 2, para restar 2 números");
            System.out.println("Dígite 3, para multiplicar 2 números");
            System.out.println("Dígite 4, para dividir 2 números");
            int opcion = teclado.nextInt();

            switch (opcion){
                case 0:
                    ingresar_numeros();
                    System.out.println("SALIR");
                    interruptor = false;
                    break;
                case 1:
                    ingresar_numeros();
                    System.out.println("La suma es: " +sumar( n1, n2));
                    break;
                case 2:
                    ingresar_numeros();
                    System.out.println("La resta es: " +restar( n1, n2));
                    break;
                case 3:
                    ingresar_numeros();
                    multiplicar(n1 ,n2);
                    break;
                case 4:
                    ingresar_numeros();
                    dividir(n1,n2);
                    break;
                default:
                    System.out.println("OPCIÖN INVALIDA");
            }
        }
    }

    public void ingresar_numeros(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el primer número: ");
        n1 = teclado.nextInt();
        System.out.println("Ingrese el segundo número: ");
        n2 = teclado.nextInt();
    }
    public static void main(String[] args) {
        OperacionAritmetica mivariable = new OperacionAritmetica();
        mivariable.ejecutar();
    }
}