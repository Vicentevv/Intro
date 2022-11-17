package Estructuras_Seleccionales_o_Selectivas;

import java.util.Scanner;

public class Algoritmo_Fecha {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el dia: ");
        int dia = teclado.nextByte();
        System.out.println("Ingrese el mes: ");
        int mes = teclado.nextByte();
        System.out.println("Ingrese el año: ");
        int año = teclado.nextByte();
        if (año > 1990 && año < 2010 && dia <= 31 && mes <=12){
            System.out.println("Es fecha correcta");
        }else if (año % 4 == 0 && año % 100!=0 || año% 400 == 0){
        }else if (dia >= 01 && dia <= 29){
            System.out.println("Es fecha correcta");
        }else if (año < 1990 && año> 2010 || dia < 31 || mes <= 12){
        System.out.println("Es fecha incorrecta");
        }else{
    }

}
}