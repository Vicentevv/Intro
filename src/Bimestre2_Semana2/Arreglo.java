package Bimestre2_Semana2;

public class Arreglo {
    public static void main(String[] args) {
        //Creación de arreglos con valores predefinidos
        String universidades [] = {"utpl","unl","espol","ucuenca","usfq","uide"};
        int tam = universidades.length; //Obtenemos el tamaño del arreglo
        System.out.println("Tamaño del arreglo:" + tam);
        for (int indice = 0; indice < tam ; indice++) {
            System.out.print(universidades[indice] +" ");
        }
        System.out.println("\n");
        //Creación de un arregli de tipo entero
        int notas [] = {7,8,5,4,10};
        for (int indice = 0; indice < notas.length ; indice++) {
            System.out.println(notas[indice]);
        }
        System.out.println("\n");
        //Creación de un arreglo de tipo char
        char vocales [] = {'a','e','i','o','u'};
        for (int indice = 0; indice < vocales.length; indice++) {
            System.out.println(vocales[indice]);
        }
        System.out.println("\n");
        //Creación de un arreglo de tipo boolean
        boolean valores [] = {true, false, true, false, true};
        for (int indice = 0; indice < valores.length; indice++) {
            System.out.println(valores[indice]);
        }
        //Creación de un arreglo de tipo decimal
        double numeros [] = {1.0, 2.5,3.1};
        for (int indice = 0; indice < numeros.length; indice++) {
            System.out.println(numeros[indice]);
        }
    }
}
