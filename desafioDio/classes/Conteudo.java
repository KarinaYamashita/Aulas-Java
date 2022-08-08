package desafioDio.classes;

public abstract class Conteudo {
// Ao criar uma classe abstract ela não pode ser instanciada. 

    protected static final double XP_PADRAO = 10d;

    private String titulo;
    private String descricao;

    public abstract double calcularXp(); // Indica que a classes filhas devem criar um metodo 

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
