package desafioDio.classes;


public class Curso extends Conteudo {
    // atribuições
    private int cargaHoraria;

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + cargaHoraria;
    }

    public String toString() {
        return "Curso{" +
                "titulo = " + getTitulo() + '\'' +
                ", descricao = " + getDescricao() + '\'' +
                ", cargaHoraria = " + cargaHoraria +
                '}';
    }

    
}
