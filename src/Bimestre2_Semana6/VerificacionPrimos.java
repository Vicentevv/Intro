package Bimestre2_Semana6;

/**
 * Programa para verificar a través de métodos si un número es primo o y si es par o impar
 *
 */
public class VerificacionPrimos {

    public boolean verificar_primo(int num_a_verificar){
        int cont_divisores = 0;
        for (int cont = 1; cont < num_a_verificar; cont++) {
            if (num_a_verificar % cont == 0); // Detectamos un nuevo dibisor
                cont_divisores++;
        }
        if (cont_divisores == 2) // Verificamos si es primo
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        VerificacionPrimos mivariable = new VerificacionPrimos();
        mivariable.verificar_primo(5);
    }
}
