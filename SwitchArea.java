import java.util.Scanner;

public class SwitchArea {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
                int opcion = teclado.nextInt();
        switch (opcion){
            case 1:
                System.out.println("Area de un triangulo");
                System.out.println("Ingrese base: ");
                double base = teclado.nextInt();
                System.out.println("Ingrese altura: ");
                double altura = teclado.nextInt();
                double area_triangulo = (base * altura)/2;
                System.out.println("El area del triangulo es: " + area_triangulo);
            case 2:
                System.out.println("Area de una circunferencia");
                System.out.println("Ingrese radio: ");
                double radio = teclado.nextInt();
                double area_circunferencia = (Math.PI*radio);
                System.out.println("El area de una circunferencia es: " + Math.pow(2, area_circunferencia));
            case 3:
                System.out.println("Area de un cuadrado");
                System.out.println("Ingrese el valor del lado: ");
                double lado = teclado.nextInt();
                double area_cuadrado = (lado*lado);
                System.out.println("El valor del area es: " + area_cuadrado);
        }
    }
}
