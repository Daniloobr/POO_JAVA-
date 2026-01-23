public class Brinquedo {
    private String nome;
    private boolean Disponivel;

    public Brinquedo(String nome, boolean Disponivel) {

        this.nome = nome;
        this.Disponivel = Disponivel;
    }

    public String getnome() {
        return nome;
    }

    public boolean isDisponivel() {
        return Disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.Disponivel = disponivel;
    }

    public String toString() {
        return "\n - " + getnome() + "\n     Está Disponivel: "
                + Disponivel;

    }

}
