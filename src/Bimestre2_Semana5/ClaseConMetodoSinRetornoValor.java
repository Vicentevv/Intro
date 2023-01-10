package Bimestre2_Semana5;

import java.util.Scanner;

public class ClaseConMetodoSinRetornoValor {
    public static void main(String[] args) {
        // Crear una variable a partir de nuestra clase
        //ClaseConMetodoSinRetornoValor = new ClaseConMetodoSinRetornoValor();
        //llamamda.saludar();
        saludar_con_nombre("Richar");
    }
    public static void saludar(){
        System.out.println("BIENVENIDO A LA CREACIÓN DE MÉTODOS");
        System.out.println("MEtódo creando en java");
    }
    public static void saludar_con_nombre(String nombre){
        System.out.println("BIENVENID@ "+nombre.toUpperCase()+" A LA CREACIÓN DE MÉTODOS");
        System.out.println("Método creado en java");
    }
}
