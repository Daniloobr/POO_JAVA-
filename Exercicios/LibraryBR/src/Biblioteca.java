import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    List<Livro> Livros = new ArrayList<>();

    public void adicionarLivro(Livro livro) {
        if (livro != null && livro.getNome() != null && !livro.getNome().isEmpty()) {
            Livros.add(livro);
        }
    }

    public void listarLivros() {
        if (Livros.isEmpty()) {
            System.out.println("A biblioteca está vazia.");
        } else {

            for (Livro livro : Livros) {
                System.out.println("Nossos Livros: --------------> " + livro.getNome());
            }

        }

    }

}
