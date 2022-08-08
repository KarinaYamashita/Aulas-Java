package aulas.aula1;

public class Calculadora {
    /**
     * @param num1
     * @param num2
     */
    public static void soma(double num1, double num2) {
        double resultado = num1 + num2;
        System.out.println("Resultado soma:"  + num1 + "+" + num2 + "=" + resultado );
    }
    public static void subtracao(double num1, double num2) {
        double resultado = num1 - num2;
        System.out.println("Resultado subtração:"  + num1 + "-" + num2 + "=" + resultado );
    }
    public static void multiplicacao(double num1, double num2) {
        double resultado = num1 * num2;
        System.out.println("Resultado soma:"  + num1 + "*" + num2 + "=" + resultado );
    }
    public static void divisao(double num1, double num2) {
        double resultado = num1 / num2;
        System.out.println("Resultado soma:"  + num1 + "/" + num2 + "=" + resultado );
    }
}
