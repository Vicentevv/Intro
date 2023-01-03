package Bimestre2_Semana4;

public class SumaMatriz {
    public static void main(String[] args) {
        int a[][] = {
                {5, 2, 7},
                {1, 9, 3},
                {4, 5, 2}
        };
        int b[][] = {
                {4, 6, 3},
                {5, 7, 1},
                {2, 8, 9}
        };
        int filas = a.length;
        int colum = b.length;
        int c[][] = new int[filas][colum];
        // Suma de Matrices a + b = c
        for (int fila = 0; fila < filas; fila++) {
            for (int col = 0; col < colum; col++) {
                c[fila] [col] = a [fila][col] + b [fila][col];
            }
        }
        // Mostrar resultados a matriz c
        for (int fila = 0; fila < filas; fila++) {
            for (int col = 0; col < colum; col++) {
                System.out.print(c[fila][col] + "\t");
            }
            System.out.println();
        }
    }
}
