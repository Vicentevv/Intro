package Bimestre2_Semana7;

import java.util.InputMismatchException;
import java.util.Scanner;

// Para realizar una division entre dos números
public class ManejoExcepcion {
    // Variables globale
    double n1;
    double n2;
    public static void main(String[] args) {
        ManejoExcepcion mivar = new ManejoExcepcion();
        mivar.ejecutar();
    }
    public void ejecutar(){
        ingresar_datos();
        dividir();
        System.out.println("Resultado = " + dividir() );
    }
    public void ingresar_datos(){
        // El bloque trynos ayuda a captar o detectar si ocurre una excepción
        try { // Este codigo tiene la posibilidad de presentar una excepción
            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingresa el numerador: ");
            n1 = teclado.nextDouble();
            System.out.println("Ingresa el denominador: ");
            n2 = teclado.nextDouble();
        } catch (ArithmeticException error_de_teclado){
            System.out.println("Manejo de la excepcion de tipo aritmético");
            System.out.println(error_de_teclado.getMessage() );
        }catch (InputMismatchException error){
            System.out.println("Manejo de excepción de entrada de datos: ");
            System.out.println(error.getMessage() );
        }
    }
    public double dividir(){
        double resultado = 0;
        try {
            // Código en el que posiblemente puede ocurrir una excepción
            resultado = n1 / n2;
            return resultado;
        }catch (Exception error){
            // Este código   se ejecuta solo si ocurre una excepción
            System.out.println("Error de tipo aritmético");
            System.out.println(error.getMessage() );
        }finally { // <-- Opcional
            // Este código se ejecuta ocurra o no la excepción
            System.out.println("Ingresó a finally");
        }
        System.out.println("Resultado: " + resultado);
        return resultado;
    }
}