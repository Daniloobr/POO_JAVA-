public class App {
    public static void main(String[] args) throws Exception {

        Brinquedo corda = new Brinquedo("corda", true);

        Brinquedo carrof1 = new Brinquedo("Carro", true);
        Brinquedo f1 = new Brinquedo("moto", false);
        Brinquedo luva = new Brinquedo("luva", true);

        GerenciadorBrinquedos caixa = new GerenciadorBrinquedos();

        caixa.cadastrarBrinquedo(carrof1);
        caixa.cadastrarBrinquedo(f1);
        caixa.cadastrarBrinquedo(luva);
        caixa.cadastrarBrinquedo(corda);

        caixa.emprestar(carrof1);

        caixa.removerBrinquedos(luva);

        caixa.listarTodosBrinquedos();

        caixa.removerBrinquedos(carrof1);

    }
}
