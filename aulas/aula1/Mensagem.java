package aulas.aula1;

public class Mensagem {
    /**
     * @param hora
     */
    public static void saudacao(int hora) {
        if ( hora >= 5 && hora <= 12){
            System.out.println("Bom Dia");
        } else if ( hora >= 13 && hora <= 17){
            System.out.println("Boa Tarde");
        } else {
            System.out.println("Boa Noite");
        }
    }
}
