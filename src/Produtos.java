
public class Produtos {
    String nome;
    Double price;
    int quantidade;

    public double totalstock() {
        return price * quantidade;
    }

    public void addProdutos() {
        quantidade++;
    }

    public void RemoProdutos() {
        quantidade--;
    }

    public String toString() {
        return nome
                + ", $ "
                + price
                + ", "
                + quantidade
                + " unidade, Total: R$ "
                + totalstock();

    }

}