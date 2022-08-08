package aulas.aula1;

public class Emprestimo {

    public static  double getDuasParcelas() {
        return 0.45;
    }
    /**
     * @return
     */
    public static  double getTresParcelas() {
        return 0.45;
    }
    public static void calcular(double capital, double juros, int tempo) {
        double totalAplicacao = capital*(1+juros)*tempo;
        System.out.println("Para um capital de " + capital + " por um periodo " + tempo + " o valor total sera " + totalAplicacao);
    }
}
