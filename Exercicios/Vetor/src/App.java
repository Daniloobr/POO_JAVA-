import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        // =========================
        // EXERCÍCIO 1
        // Relatório de alunos e média da turma
        // =========================

        String[] nomesAlunos = new String[5];
        Double[] notasAlunos = new Double[5];

        nomesAlunos[0] = "Danilo";
        nomesAlunos[1] = "CHARLES";
        nomesAlunos[2] = "LUCAS";
        nomesAlunos[3] = "ANA KESIA";
        nomesAlunos[4] = "BATALHA";

        notasAlunos[0] = 10.0;
        notasAlunos[1] = 10.0;
        notasAlunos[2] = 7.0;
        notasAlunos[3] = 5.0;
        notasAlunos[4] = 7.0;

        double soma = 0;

        System.out.println("=== RELATÓRIO DE ALUNOS ===");
        for (int i = 0; i < notasAlunos.length; i++) {
            System.out.println(nomesAlunos[i] + " -- " + notasAlunos[i]);
            soma += notasAlunos[i];
        }

        double media = soma / nomesAlunos.length;
        System.out.println("\nA média da turma é: " + media);

        // =========================
        // EXERCÍCIO 2
        // Listagem de números
        // =========================

        Double[] number = new Double[5];

        number[0] = 10.0;
        number[1] = 10.0;
        number[2] = 7.0;
        number[3] = 5.0;
        number[4] = 7.0;

        System.out.println("New Project -----------------------------------------------");
        for (int i = 0; i < number.length; i++) {
            System.out.println("Numbers: " + number[i]);
        }

        // =========================
        // EXERCÍCIO 3
        // Soma dos números
        // =========================

        Double[] number2 = new Double[5];

        number2[0] = 10.0;
        number2[1] = 10.0;
        number2[2] = 7.0;
        number2[3] = 5.0;
        number2[4] = 7.0;

        double soma3 = 0;
        System.out.println("New Project ( SOMA) -----------------------------------------------");
        for (int i = 0; i < number2.length; i++) {
            soma3 += number2[i];
        }

        System.out.println("Resultado da soma: " + soma3);

        // =========================
        // EXERCÍCIO 4
        // Maior número do array
        // =========================

        int[] nb = { 20, 10, 30, 100 };
        int maior = nb[0];

        for (int i = 0; i < nb.length; i++)
            if (nb[i] > maior) {
                maior = nb[i];
            }

        System.out.println("--------------------------------------------------------");
        System.out.println("O maior number da lista: " + maior);

        // =========================
        // EXERCÍCIO 5
        // Menor número do array
        // =========================

        int[] na = { 20, 10, 30, 100 };
        int menor = na[0];

        for (int i = 0; i < na.length; i++)
            if (na[i] < menor) {
                menor = na[i];
            }

        System.out.println("--------------------------------------------------------");
        System.out.println("O menor number da lista: " + menor);
    }
}
