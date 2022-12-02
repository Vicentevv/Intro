package EjerciciosFinales;

import java.io.*;
import java.util.Scanner;

public class fecha_nacimiento {

	public static double es_bisiesto(double ano) {
		double x;
		// Formula para definir si es año bisiesto o no
		if (ano%4==0 && ano%100!=0 || ano%400==0) {
			x = 1;
		} else {
			x = 0;
		}
		return x;
	}

	// Calcular el numero de dias entre cualquier fecha
	public static double num_dias(Double ano, int mes, double dia) {
		double b;
		double d;
		b = es_bisiesto(ano);
		switch (mes) {
		case 1:
			d = 31;
			break;
		case 2:
			d = 31+28+b;
			break;
		case 3:
			d = 31+28+b+31;
			break;
		case 4:
			d = 31+28+b+31+30;
			break;
		case 5:
			d = 31+28+b+31+30+31;
			break;
		case 6:
			d = 31+28+b+31+30+31+30;
			break;
		case 7:
			d = 31+28+b+31+30+31+30+31;
			break;
		case 8:
			d = 31+28+b+31+30+31+30+31+31;
			break;
		case 9:
			d = 31+28+b+31+30+31+30+31+31+30;
			break;
		case 10:
			d = 31+28+b+31+30+31+30+31+31+30+31;
			break;
		case 11:
			d = 31+28+b+31+30+31+30+31+31+30+31+30;
			break;
		case 12:
			d = 31+28+b+31+30+31+30+31+31+30+31+30+31;
			break;
		}
		d = dia;
		return d;
	}

	public static void main(String args[]) throws IOException {
		Scanner teclado = new Scanner(System.in);

		double ano_actual = 0 ;
		double ano_nacimiento = 0;
		double dias_diferecia_residual_entero = 0;
		double dias_diferencia = 0;
		double dias_diferencias_residual_decimal = 0;
		double dias_diferencia_residual = 0;
		double dias_por_mes_promedio = 0;
		double dias_total_fecha_actual = 0;
		double dias_total_fecha_nacimiento = 0;
		double dia_actual = 0;
		double dia_nacimiento = 0;
		double meses_diferencia = 0;
		double meses_diferencia_decimal = 0;
		double anos_diferencia = 0;
		double meses_diferencia_entero = 0;
		int mes_actual = 0;
		int mes_nacimiento = 0;
		double meses_diferencia_total = 0;

		// Constante
		dias_por_mes_promedio = (365/12);

		System.out.println("Ingrese la fecha actual: ");
		System.out.println("Ano actual: ");
		ano_actual = teclado.nextDouble();
		System.out.println("Mes actual: ");
		mes_actual = teclado.nextInt();
		System.out.println("Dia actual: ");
		dia_actual = teclado.nextDouble();
		System.out.println("Ingrese su fecha de nacimiento: ");
		System.out.println("Ano nacimiento: ");
		ano_nacimiento = teclado.nextDouble();
		System.out.println("Mes nacimiento: ");
		mes_nacimiento = teclado.nextInt();
		System.out.println("Dìa nacimiento: ");
		dia_nacimiento = teclado.nextDouble();

		// Calculo de los años enteros
		// Se resta el año actual ingresado y el año de nacimiento ingresado
		anos_diferencia = (ano_actual - ano_nacimiento);
		// Calculo de los meses enteros
		// Desde la fecha actual y la fecha de nacimiemiento los d�as totales son
		dias_total_fecha_nacimiento = num_dias(ano_nacimiento,mes_nacimiento-1,dia_nacimiento);
		dias_total_fecha_actual = num_dias(ano_actual,mes_actual-1,dia_actual);
		dias_diferencia = dias_total_fecha_actual-dias_total_fecha_nacimiento;
		// Se divide los numeros por meses promedio 
		meses_diferencia = (dias_diferencia/dias_por_mes_promedio);
		meses_diferencia_total = (meses_diferencia * dias_por_mes_promedio);
		meses_diferencia_entero = Math.floor (meses_diferencia_total);
		// Se calcula el numero de dias
		meses_diferencia_decimal = meses_diferencia-meses_diferencia_entero;
		dias_diferencia_residual = (meses_diferencia_decimal/dias_por_mes_promedio);
		dias_diferecia_residual_entero = Math.floor (dias_diferencia_residual);
		dias_diferencias_residual_decimal = (dias_diferencia_residual-dias_diferecia_residual_entero);

		System.out.println("Usted tiene "+anos_diferencia+" anos, con "+meses_diferencia_entero+" meses y "+dias_diferecia_residual_entero+" dias ");
	}


}

