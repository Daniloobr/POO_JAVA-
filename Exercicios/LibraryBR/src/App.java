public class App {
    public static void main(String[] args) throws Exception {

        Biblioteca biblioteca = new Biblioteca();

        Livro L1 = new Livro("HABITOS ATOMICOS", 200, true);
        Livro L2 = new Livro("SEGREDOS DA MENTE MILIONARIA", 200, true);
        Livro L5 = new Livro("NADA PODE ME PARAR", 200, true);

        biblioteca.adicionarLivro(L5);
        biblioteca.adicionarLivro(L1);
        biblioteca.adicionarLivro(L2);

        biblioteca.listarLivros();

    }
}
