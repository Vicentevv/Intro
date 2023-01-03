package Bimestre2_Semana4;

public class Matriz {
    public static void main(String[] args) {
        int matriz [][]=new int[2][3];
        System.out.println(matriz[1][2]);
        // Creación de una matriz con valores predefinidos
        String univ [][] = {
                {"utpl","ucuenca","espol"},
                {"unl","uazuay","uide"}
        };
        //System.out.println("Dimensión de la matriz: ");
        //System.out.println("Filas: " + univ.length);
        //System.out.println("Columnas: " + univ[0].length);
        int filas = univ.length;
        int columnas = univ[0].length;
        for (int fila = 0; fila < filas ; fila++) {
            for (int colum = 0; colum < columnas ; colum++) {
                System.out.print(univ[fila][colum] + "  ");
            }
            System.out.println();
        }
    }
}
