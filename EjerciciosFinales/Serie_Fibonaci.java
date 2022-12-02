package EjerciciosFinales;

import java.io.*;
import java.util.Scanner;

public class Serie_Fibonaci{

	public static void main(String args[]) throws IOException {
		Scanner teclado = new Scanner(System.in);
		String a;
		String b;
		String c;
		double contador;
		double i;
		double num;
		double num1;
		double num2;
		double suma;
		System.out.println("Ingrese un valor: ");
		num = teclado.nextDouble();
		num1 = 0;
		num2 = 1;
		suma = 1;
		a = "";
		b = "*";
		c = "*";
		contador = 1;
		i = 1;
		while (contador<=num) {
			System.out.println(c);
			contador = contador+1;
			c = a+b;
			a = b;
			b = c;
		}
		while (i<=num) {
			i = i+1;
			suma = num1+num2;
			num1 = num2;
			num2 = suma;
		}
	}


}

