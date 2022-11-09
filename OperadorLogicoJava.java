public class OperadorLogicoJava {
    public static void main(String[] args) {
        System.out.println("PRUEBA DE OPERADORES LOGICOS");
        boolean valor = ( 5 == 5 ); // Operador de relaciones
        boolean valor_logico = ((5==5) || (4>=3)); // V or F
        boolean valor_logico_and = ((5==5)&&(4>=3)); // V or v -> V
        System.out.println("valor: " +valor);
        System.out.println("valor_logico: " +valor_logico);
        System.out.println("valor_logico_and: " +valor_logico_and);
        System.out.println("Negación del valor_logico: " +valor_logico);
    }
}
