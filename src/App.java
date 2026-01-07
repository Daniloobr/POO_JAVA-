
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        Produtos Iphones = new Produtos();

        System.out.println("Digite o nome do Produto: ");
        Iphones.nome = sc.nextLine();

        System.out.println("Digite a quantidade: ");
        Iphones.quantidade = sc.nextInt();

        System.out.println("Digite o valor:");
        Iphones.price = sc.nextDouble();

        System.out.println("Temos " + Iphones.nome + " no valor de RS: " + Iphones.price + " E só temos "
                + Iphones.quantidade + " Unidades ");

        System.out.print("Digite a quantidade para se adicionar ");

        int add = sc.nextInt();

        for (int i = 0; i < add; i++) {
            Iphones.addProdutos();
        }

        System.out.println("Quer remover algum produto? ( SIM OU NAO )");
        String p = sc.nextLine();

        sc.next();

        int rem = 0;

        if (p.equalsIgnoreCase("sim")) {
            System.out.print("Digite a quantidade para REMOVER: ");
            rem = sc.nextInt();
        }

        for (int i = 0; i < rem; i++) {
            Iphones.RemoProdutos();
        }

        System.out.println(Iphones.toString());

        sc.close();
    }
}
