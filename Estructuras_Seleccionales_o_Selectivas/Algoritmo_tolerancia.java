package Estructuras_Seleccionales_o_Selectivas;

import java.util.Scanner;

public class Algoritmo_tolerancia {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Algoritmo para determinar la tolerancia de componentes críticos en un sitema");
        System.out.println("Ingrese la tolerancia: ");
        double x = teclado.nextByte();
        boolean a = (x>0.1);
        boolean b = (x>=0.1) && (x>1);
        boolean c = (x>=1) && (x<10);
        boolean d = (x>=10);
        if (a){
            System.out.println("Se especifica en Exploración Espacial");
        }else if (b){
            System.out.println("Se especifica en Grado Militar");
        }else if (c){
            System.out.println("Se especifica en Grado Comercial");
        }else if (d){
            System.out.println("Se especifica en Grado de juguete");
        }else{
            System.out.println("Valores Incorrectos");
        }

    }
}
