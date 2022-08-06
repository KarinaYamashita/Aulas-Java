package aula;

import java.util.Calendar;
import java.util.GregorianCalendar;

import aula.aula1.Calculadora;
import aula.aula1.Emprestimo;
import aula.aula1.Mensagem;
import aula.aula2.CalculaArea;

public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {

        // Calculadora
        System.out.println("Exercício calculadora");
        Calculadora.soma(3,6);
        Calculadora.subtracao(9, 1.8);
        Calculadora.multiplicacao(7, 8);
        Calculadora.divisao(5, 2.5);
        //O David ajudou

        // Mensagem
        System.out.println("Exercício mensagem");
        //Date date = new Date();
        Calendar calendar = GregorianCalendar.getInstance();
        final int hour = calendar.get(Calendar.HOUR_OF_DAY);
        Mensagem.saudacao(hour);

        // Empréstimo
        System.out.println("Exercício empréstimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas(),2);
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas(),3);
        Emprestimo.calcular(1000,.78, 5);

         // Quadrilátero
         System.out.println("Exercício quadrilátero");
         System.out.println("A área do quadrado é " + CalculaArea.area(3));
         System.out.println("A área do retângulo é " + CalculaArea.area(5d,5d));
         System.out.println("A área do trápezio é " + CalculaArea.area(7,8,9));
         System.out.println("A área do retângulo é " + CalculaArea.area(5f,5f));

    }
}
