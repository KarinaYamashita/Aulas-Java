package desafioDio.classes;

import java.time.LocalDate;

public class Mentoria extends Conteudo{
    // atribuições
    private LocalDate data;

    
    public void setData(LocalDate data) {
        this.data = data;
    }
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }
    @Override
    public double calcularXp() {
        return XP_PADRAO + 20;
    }
}
