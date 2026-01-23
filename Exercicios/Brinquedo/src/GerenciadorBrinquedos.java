import java.util.ArrayList;
import java.util.List;

public class GerenciadorBrinquedos {

    List<Brinquedo> brinquedos = new ArrayList<>();

    public void cadastrarBrinquedo(Brinquedo b) {
        brinquedos.add(b);
        System.out.println(b.getnome() + " adicionado com sucesso!");
    }

    public void listarTodosBrinquedos() {
        System.out.println("---------------- Nossa Lista de Brinquedos:  --------------------");

        for (Brinquedo brinquedo : brinquedos) {
            System.out.println(brinquedo.getnome() +
                    " - " + (brinquedo.isDisponivel() ? "Disponível" : "Emprestado"));
        }

        System.out.println("---------------- -----------  --------------------");

    }

    public void listarBrinquedosDisponiveis() {

        boolean encontrou = false;

        for (Brinquedo brinquedo : brinquedos) {
            if (brinquedo.isDisponivel()) {
                System.out.println("Brinquedo disponível: " + brinquedo.getnome());
                encontrou = true;
            }
        }

        if (!encontrou) {
            System.out.println("Nenhum brinquedo disponível no momento.");
        }
    }

    public void removerBrinquedos(Brinquedo b) {
        if (b.isDisponivel()) {
            brinquedos.remove(b);
            System.out.println("Brinquedo: " + b.getnome() + " removido com sucesso");
        } else {
            System.out.println("Não é possível remover um brinquedo Emprestado.");
        }
    }

    public void emprestar(Brinquedo b) {
        if (b.isDisponivel()) {
            b.setDisponivel(false);
            System.out.println("Brinquedo emprestado: " + b.getnome());
        } else {
            System.out.println("Brinquedo já está emprestado.");
        }
    }

    public void devolver(Brinquedo b) {

        if (!b.isDisponivel()) {
            b.setDisponivel(true);
            System.out.print("Brinquedo Devolvido: ");
        } else {
            System.out.println("Brinquedo já foi Devolvido.");
        }
    }

}
