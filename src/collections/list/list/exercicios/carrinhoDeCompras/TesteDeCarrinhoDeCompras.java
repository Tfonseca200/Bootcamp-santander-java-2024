package collections.list.list.exercicios.carrinhoDeCompras;

public class TesteDeCarrinhoDeCompras {

    public static void main(String[] args) {

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionarItem("danone",2.50,2);
        carrinho.adicionarItem("leite",5,6);
        carrinho.adicionarItem("açucar",3,4);
        carrinho.adicionarItem("suco",7,3);

        carrinho.exibirItens();

        carrinho.calcularValorTotalDoCarrinho();

        System.out.println("\n--------------------------------------------------------------------\n");


        carrinho.removeItem("suco");
        carrinho.removeItem("leite");

        carrinho.exibirItens();

        carrinho.calcularValorTotalDoCarrinho();




    }
}
