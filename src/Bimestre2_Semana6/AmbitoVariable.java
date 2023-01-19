package Bimestre2_Semana6;

import org.w3c.dom.ls.LSOutput;

public class AmbitoVariable {
    static int numero = 10; // Creaciòn de variables global.

    public static void cambiar_valor (){
        numero = numero + 15;
        int valor = 5;
    }

    public void cambiar_valor(int numero){
        this.numero = this. numero + 50;
    }

    public static void main(String[] args) {
        cambiar_valor();
        System.out.println("El nuevo valor de número: " + numero);
        AmbitoVariable minivariable = new AmbitoVariable();
        minivariable.cambiar_valor(100);
        System.out.println("El nuevo valor de número: " +numero);

        int indice = 0;
        for (indice = 0; indice < 5; indice++){
            System.out.println("Repetición: "+indice);
        }
        System.out.println("El valor final de indice: " +indice);
    }
}
