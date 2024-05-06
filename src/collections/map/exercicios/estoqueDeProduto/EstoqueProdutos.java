package collections.map.exercicios.estoqueDeProduto;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

    private Map<Long,Produto> estoquesProdutosMap;

    public EstoqueProdutos() {
        this.estoquesProdutosMap = new HashMap<>();
    }

    public void adicionarProduto(long id, String nome,int quantidade, double preco){
        estoquesProdutosMap.put(id,new Produto(nome,quantidade,preco));
    }

    public void exibirProdutos(){
        System.out.println(estoquesProdutosMap);
    }

    public double calcularValorTotal(){
        double valorTotalEstoques = 0;
        if(!estoquesProdutosMap.isEmpty()){
            for (Produto produtos : estoquesProdutosMap.values()){
                valorTotalEstoques += produtos.getQuantidade() * produtos.getPreco();
            }
        }
        return valorTotalEstoques;
    }

    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;

        if(!estoquesProdutosMap.isEmpty()){
            for (Produto produto : estoquesProdutosMap.values()){
                if(produto.getPreco() > maiorPreco){
                    produtoMaisCaro = produto;
                    maiorPreco = produto.getPreco();
                }
            }
        }
        return produtoMaisCaro;
    }

    public static void main(String[] args) {

        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();

        estoqueProdutos.adicionarProduto(1,"açai",1,35.0);
        estoqueProdutos.adicionarProduto(2,"leite",2,6.0);
        estoqueProdutos.adicionarProduto(3,"suco",2,10.0);
        estoqueProdutos.adicionarProduto(4,"banana",2,3.0);

        estoqueProdutos.exibirProdutos();

        System.out.println("Valor total do estoque R$ " + estoqueProdutos.calcularValorTotal());
        System.out.println("Produto mais caro R$ " + estoqueProdutos.obterProdutoMaisCaro());
    }
}
