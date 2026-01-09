import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");

        String nome = sc.nextLine();

        Bank bank = new Bank(nome);

        System.out.print("Digite o valor do depósito inicial: ");
        Double saldo = sc.nextDouble();

        bank.saldo = (saldo);
        System.out.print(bank);

    }
}