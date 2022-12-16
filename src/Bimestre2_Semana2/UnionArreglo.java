package Bimestre2_Semana2;

public class UnionArreglo {
    public static void main(String[] args) {
        String marcas1 [] = {"hp","dell","asus","lenovo","toshiba"};
        String marcas2 []= {"samsung","huawei","dere"};
        int tam_arr_resultado = marcas1.length + marcas2.length;
        String result [] = new String[tam_arr_resultado];
        for (int indice = 0; indice < marcas1.length; indice++) {
            result [indice] = marcas1 [indice];
        }
        // Copiamos los valores del arreglo marcas 2 en el arreglo result
        // int indice2 = 0
        for (int indice = marcas1.length, indice2 = 0; indice < result.length ; indice++, indice2++) {
            result[indice] = marcas2[indice2];
            // indice2 ++
        }
        // Mostramos todos los elementos del arreglo res
        for (int indice = 0; indice < result.length; indice++) {
            System.out.println(result[indice]);
        }
    }
}
