public class Livro {
    private String nome;
    private int pages;
    private boolean disponivel;

    public Livro(String nome, int pages, boolean disponivel) {
        this.nome = nome;
        this.pages = pages;
        this.disponivel = disponivel;
    }

    public void GetDisponvel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public String getNome() {
        return nome;
    }

    public int getPages() {
        return pages;
    }
}
