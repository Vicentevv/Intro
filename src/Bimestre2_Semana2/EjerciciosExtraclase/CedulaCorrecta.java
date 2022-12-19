package EjerciciosExtraclase;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CedulaCorrecta {
    public static void main(String args[]) throws IOException {
        BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
        double acumulador;
        String ced;
        double cedula[];
        int decena;
        int indice;
        double resultadoresta;
        cedula = new double[10];
        System.out.println("Ingrese su numero de cedula: ");
        for (indice=1;indice<=10;indice++) {
            ced = bufEntrada.readLine();
            cedula[indice-1] = Double.parseDouble(ced);
        }
        for (indice=1;indice<=9;indice+=2) {
            cedula[indice-1] = cedula[indice-1]*2;
        }
        for (indice=1;indice<=9;indice++) {
            if ((cedula[indice-1]>=10)) {
                cedula[indice-1] = cedula[indice-1]-9;
            }
        }
        acumulador = 0;
        for (indice=1;indice<=9;indice++) {
            acumulador = cedula[indice-1]+acumulador;
        }
        decena = 0;
        if ((acumulador>0)) {
            decena = (int) Math.floor(acumulador/10);
        }
        decena = (decena*10)+10;
        resultadoresta = 0;
        resultadoresta = decena-acumulador;
        if ((resultadoresta==cedula[9])) {
            System.out.println("El número de cédula es correcto");
        } else {
            System.out.println("Cédula incorrecta");
        }
    }


}

