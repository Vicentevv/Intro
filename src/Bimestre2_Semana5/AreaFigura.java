package Bimestre2_Semana5;

import java.util.Scanner;

public class AreaFigura {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Programa para obterner el área de figuras geómetricas");
        System.out.println("Digite 1 para obtener el área de una circunferencia: ");
        System.out.println("Digite 2 para obtener el área de un cuadrado: ");
        System.out.println("Digite 3 para obtener el área de un cilindro: ");
        int opcion = teclado.nextInt();
    }
    public void seleccionar_figura (int opcion){
        Scanner teclado = new Scanner(System.in);
        switch (opcion){
            case 1:
                System.out.println("Ingrese el valor del radio: ");
                double radio = teclado.nextInt();
                double area = obtener_area_circunferencia(radio);
                System.out.println("El área es" +area);
                break;

        }
    }

    /**
     * Método para obterner el área de una circunferencia
     * @param radio
     * @return
     */
    public double obtener_area_circunferencia (double radio){
        double area = Math.PI + Math.pow(radio, 2);
        return area;

    }

    /**
     * Método para obtener el área de un cuadrado
     * @param lado
     * @return
     */
    public double obtener_area_cuadrado(double lado){
        double area = lado * lado;
        return area;
    }
    public void obtener_area_cilindro(){

    }
}
