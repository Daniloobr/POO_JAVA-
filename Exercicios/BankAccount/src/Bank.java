public class Bank {

    int numeroConta;
    String titular;
    double saldo;

    static int totalContas;

    public Bank(String titular) {

        this.titular = titular;
        this.saldo = 0;

        totalContas++;

        this.numeroConta = totalContas;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        } else {
            System.out.println("Valor inválido.");
        }
    }

    public String toString() {
        return "Titular: "
                + titular +
                "\n" +
                "Saldo: R$ " +
                saldo;
    }

}
